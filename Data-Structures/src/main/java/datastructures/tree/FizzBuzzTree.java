package datastructures.tree;

public class FizzBuzzTree {
    NodeString root;

    public FizzBuzzTree(NodeString root) {
        this.root = root;
    }
    public void replace(){
        replace(this.root);
    }
    private void replace(NodeString runner) {
        if (runner != null){
            int runnerValue = Integer.parseInt(runner.value);
            if(runnerValue % 15 == 0) {       //check if input is greater than
                runner.value = "FizzBuzz";
            }
            else if(runnerValue % 5 == 0) {       //check if input is greater than
                runner.value = "Buzz";
            }
            else if(runnerValue % 3 == 0) {       //check if input is greater than
                runner.value = "Fizz";
            }
            replace(runner.left);
            replace(runner.right);
        }
    }
}

