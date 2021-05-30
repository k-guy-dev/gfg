import java.util.*;
import java.io.*;
class Main{

	//KMP Algorithm
	static void kmp(String pat, String txt){
		int N = txt.length();
		int M = pat.length();

		int[] lps = new int[M];

		int i = 0; //Index of txt
		int j = 0; //Index of pattern

		while(i<N){
			if(pat.charAt(j) == txt.charAt(i)){
				i++;
				j++;
			}
			if(j == M){
				System.out.println("Pattern Found At Index: " + (i-j));
				j = lps[j-1];
			}else if(i<N && pat.charAt(j) != txt.charAt(i)){
				if(j!=0){
					j = lps[j-1];
				}else{
					i++;
				}
			}
		}
	}

	
	//function to compute lps array

	static void computeLPS(String pat, int M, int[] lps){
		int i = 1;
		int len = 0;
		lps[0] = 0;

		while(i<M){
			if(pat.charAt(i) == pat.charAt(len)){
				len++;
				lps[i] = len;
				i++;
			}
			else{
				if(len != 0){
					len = lps[len-1];
				}
				else {
					lps[i] = len;
					i++;
				}
			}
		}
	}


	//utitlity function to print array
	static void printArr(int[] arr){
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] s = br.readLine().split(" ");
		int[] arr = new int[n];
		for(int i = 0;i<n;i++){
			arr[i] = Integer.parseInt(s[i]);
		}
		int d = Integer.parseInt(br.readLine());

		leftRotate(d,arr);
		printArr(arr);


	}
}


















