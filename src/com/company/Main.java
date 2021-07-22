package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public abstract class BaseAction {
        private final int key;
        private final String name;


        public BaseAction(int key, String name) {
            this.key = key;
            this.name = name;
        }
        public abstract void execute(Input input, Tracker tracker);
        public String info(){
            return String.format("%s:%s", this.key, this.name);
        }

    }
    class AddItem extends BaseAction{
        public AddItem( int key, String name){
            super(key,name);
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            String name = input.ask("Enter name");
            String desc = input.ask("Enter description");
            tracker.add(new Item(name,desc));
        }

    }
    public interface Input{
        String LOG = "LOG";
        String ask(String question);
        
    }

}
