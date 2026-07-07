class Count_Number_Consistence_String {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set = new HashSet<>();
        for(char ch : allowed.toCharArray()){
            set.add(ch);
        }
        
        int cnt = 0;

        for(String str : words){
            boolean consist= true;
            for(char ch : str.toCharArray()){
                if(!set.contains(ch)){
                    consist  = false;
                    break;
                }
            }
            if(consist){
                cnt++;
            }
        }
        return cnt;
    }
}