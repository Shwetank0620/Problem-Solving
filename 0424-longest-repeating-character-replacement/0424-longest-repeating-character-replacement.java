class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int maxLen = 0;
        int maxFreq = 0;

        HashMap<Character, Integer> charFreq = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            charFreq.put(currentChar, charFreq.getOrDefault(currentChar, 0) + 1);
                
            maxFreq = Collections.max(charFreq.values());

            if ((right - left + 1) - maxFreq > k) {
                char leftChar = s.charAt(left);
                charFreq.put(leftChar, charFreq.get(leftChar) - 1);
                left++;
            }
                
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;

    }
}    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        /*int l=0, r=0, max_len=0, max_f=0;
        HashMap<Character,Integer> Map = new HashMap<Character,Integer>();
        Map.put('A',0);
        while(r<s.length()){
            Map.get(s.charAt(r)-'A');
            r++;
            max_f = Math.max(max_f, Map.get(s.charAt(r)-'A'));
            if((r-l+1)-max_f>k){
                Map.get(s.charAt(l)-'A');
                l--;
                for(int i=0; i<s.length(); i++){
                    max_f=Math.max(max_f, Map.get(s.charAt(i)));
                    l=l+1;
                }
            }
            if((r-l+1)-max_f<=k){
                max_len=Math.max(max_len,r-l+1);
            
            }
            r++;

        }
        return max_len;*/
    
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        /*Brute Force
        int n=s.length();
        for(int i=0;i<=n;i++){
            int max_f=0;
            HashMap<Character,Integer> map =new HashMap<Character,Integer>();
            map.containsKey(s.charAt(j))=0;
            for(int j=i;j<=n;j++){
                map.get(s.charAt(j)-'A')++;
                
            }
            max_f=Math.max(max_f,map.get(s.charAt(j)-'A'));
            int changes=(j-i+1)-max_f;
            if(changes <= k){
                int max_length=Math.max(max_length,(j-i+1));
            }
            else{
                break;
            }
        }
        return max_length ;
        */
    
