interface Coder {
    void startCoding();
}

interface Tester {
    void startTesting();
}

class Deploy implements Coder, Tester {
    @Override
    public void startCoding(){
        System.out.println("Coding is start by the team.");
    }

    @Override
    public void startTesting(){
        System.out.println("Testing is start by Testing Team.");
    }

    public void deploy(){
        System.out.println("Deployment is started.....");
    }
}

public class MultipleInheritance {
    public static void main(String[] args){
        Deploy obj = new Deploy();
        obj.startCoding();
        obj.startTesting();
        obj.deploy();

        System.out.println("Project Deployed Successfully.");

    }
}
