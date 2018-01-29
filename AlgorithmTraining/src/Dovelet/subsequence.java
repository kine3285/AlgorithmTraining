package Dovelet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
 
public class subsequence {
 
    public static class Subsequence {
        int min = Integer.MAX_VALUE;
         
        int sum;
        ArrayList<Integer> queue = new ArrayList<Integer>();
         
        public void push(int a)  {
            queue.add(a);
             
            sum += a;
        }
         
        public void pop() {
            int a = queue.get(0);
            sum -= a;
            queue.remove(0);
        }
         
        public void set_min(int val) {
            if(val < min) {
                min = val;
            }
        }
         
        public Subsequence() {
            // 입력
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            int S = scanner.nextInt();
            int[] a = new int[num];
            for(int i=0; i<num; i++) {
                a[i] = scanner.nextInt();
            }
             
            int s=0, e =0;
            while(true) {
                if(sum < S) {
                    if(e==num) break;
                     
                    push(a[e]);
                    e++;
                }
                else {
                    if(queue.size() == 0) break;
                    set_min(e-s);
                     
                    pop();
                    s++;
                }
                 
            }
 
            if(min != Integer.MAX_VALUE) {
                System.out.println(min);
            }
            else {
                System.out.println("0");
            }
        }
    }
    public static void main(String[] args) {
        new Subsequence();
    }
 
}