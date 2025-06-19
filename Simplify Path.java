class Solution {
    public String simplifyPath(String path) {
        String parts[] = path.split("/");
        ArrayDeque<String> arr = new ArrayDeque<>();
        for(String i: parts)
        {
            if(i.equals("") || i.equals(".")) continue;
            if(i.equals(".."))
            {
                arr.pollLast();
            }
            else  arr.addLast(i);
        }
        StringBuilder result = new StringBuilder();
        for (String dir : arr) {
            result.append("/").append(dir);
        }
        
        if(arr.size() == 0) return "/";
        return result.toString();
    }
}