class Solution {
    public boolean isPalindrome(String s) {

        if(s==null || s.isEmpty())
            return true;
        
        int l=0, r=s.length()-1;
        while(l<r)
            if(!Character.isLetterOrDigit(s.charAt(l)))
                l++;
            else if(!Character.isLetterOrDigit(s.charAt(r)))
                r--;
            else{
                if(Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r)))
                    return false;
            l++;
            r--;
            }
        return true;
    }
}

// Character.isLetterOrDigit() keeps letters (a-z) and numbers (0-9), but filters out spaces and punctuation (!, @, ,).