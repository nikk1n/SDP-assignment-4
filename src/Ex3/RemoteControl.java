package Ex3;

import java.util.Stack;
//Stores and controls commands
public class RemoteControl {
    private Command[] commands;
    private Stack<Command> undoStack;

    public RemoteControl() {
        commands = new Command[5];
        undoStack=new Stack<>();
    }
    public void setCommands(int slot,Command command){
        commands[slot]=command;
    }
    public void pressButton(int slot){
        commands[slot].execute();
        undoStack.push(commands[slot]);
    }
    public void pressUndo(){
        if(!undoStack.isEmpty()){
            Command undoCommand=undoStack.pop();
            undoCommand.undo();
        }
    }
}
