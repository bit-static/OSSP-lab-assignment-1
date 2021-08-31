package com.vishesh;

public class binary_seacrh {

    static int binary_search(int[] arr,int target){
        int l=0,r=arr.length-1;

        while(l<=r){
            int m=(l+r)/2;

            if(target<arr[m])
                r=m-1;

            else if(target>arr[m])
                l=m+1;

            else
                return m;
        }

        return -1;

    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,889};
        int target=6;
        int ans=binary_search(arr,target);
        System.out.println(ans);

    }
}
