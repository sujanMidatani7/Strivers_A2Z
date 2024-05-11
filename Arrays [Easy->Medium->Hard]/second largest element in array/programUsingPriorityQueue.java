int print2largest(int arr[], int n) {
        // code here
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int i:arr)pq.add(i);
        
        int t=pq.poll(),f=pq.poll();
        while(t==f){
            try{
            t=f;
            f=pq.poll();
            }catch(Exception e) {return -1;}
        }
        return f;
    }
