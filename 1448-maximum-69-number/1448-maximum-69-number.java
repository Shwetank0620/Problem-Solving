class Solution {
    public int maximum69Number (int num) 
    {
        String n=Integer.toString(num);
        String res="";
        boolean once=true;
        for(char t:n.toCharArray())
        {
            if(t=='6'&&once)
            {
                once=false;
                res+="9";
            }
            else
            {
                res+=t;
            }
        }

        return Integer.parseInt(res);
        
    }
}

/*method 2:


class Solution {
    public int maximum69Number (int num) 
    {
        String n=Integer.toString(num);
        int index=0;
        if(n.indexOf('6')>=0)
        {
            index=n.indexOf('6');
        }
        int res=Integer.parseInt(n.substring(0,index)+"9"+n.substring(index+1));
        return res;
    }
}*/