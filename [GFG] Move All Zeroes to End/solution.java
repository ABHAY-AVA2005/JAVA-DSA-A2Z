        int n=arr.length;
        int[] temp=new int[n];
        int count=0;//non zero
        
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                temp[count++]=arr[i];
            }
            
        }
        
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=temp[i];
        }
        
    }
}
