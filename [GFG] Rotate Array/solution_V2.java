        d=d%n;
        
        reverse(arr,0,n-1);
        reverse(arr,0,n-d-1);
        reverse(arr,n-d,n-1);
        
    }
    
    static void reverse(int[] arr,int left,int right)
    {
        while(left<right)
        {
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            
            left++;
            right--;
        }
    }
}