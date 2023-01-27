/*package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.max;
import static java.lang.Math.min;

class Pair{
    int first;
    int second;

    public void setPair(int first, int second){
        this.first = min(first, second);
        this.second = max(first, second);
    }
    public int getFirst() {
        return first;
    }

    public int getSecond() {
        return second;
    }
}
class Node{
    int root;
    int numOfNodes;
    Node[] nodes;

    Node(int root){
        this.root = root;
        numOfNodes = 0;
        nodes = new Node[100];
    }
    void Connect(int root){
        nodes[numOfNodes++] = new Node(root);
    }
    void connect(Node node){
        nodes[numOfNodes++] = node;
    }

}


public class Baekjoon2606 {
    static int numberOfComputers;
    static int numberOfLinkedComputers;
    static Pair[] pairsOfLinkedComputers;
    static Node node = new Node(1);
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        setNumberOfComputers(sc.nextInt());
        setNumberOfLinkedComputers(sc.nextInt());

        pairsOfLinkedComputers = setPairs();


    }
    static void setNumberOfComputers(int numberOfComputers){
        Baekjoon2606.numberOfComputers = numberOfComputers;
    }

    static void setNumberOfLinkedComputers(int numberOfLinkedComputers) {
        Baekjoon2606.numberOfLinkedComputers = numberOfLinkedComputers;
    }

    static Pair[] setPairs(){
        Pair[] pairs = new Pair[numberOfLinkedComputers];
        for(int i=0;i<numberOfLinkedComputers;i++){
            pairs[i].setPair(sc.nextInt(),sc.nextInt());
        }

        return pairs;
    }

}
*/