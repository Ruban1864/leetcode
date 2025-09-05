class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean[] vis = new boolean[n];
        Queue<Integer> q = new ArrayDeque<>();
        q.offer(0);
        vis[0] = true;
        int count = 0;

        while(q.size() != 0){
            int c = q.poll();
            count++;
            for(int x : rooms.get(c)){
                if(!vis[x]){
                    vis[x] = true;
                    q.offer(x);
                }
            }
        }
        return count == n;
    }
}