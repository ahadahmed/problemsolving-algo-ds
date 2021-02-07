package com.maico.stack;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author ahadahmed - 2/6/21
 * @see <a href="https://www.algoexpert.io/questions/Shorten%20Path"> see problem description</a>
 */
public class ShortenUnixPath {

    public String shortenUnixPath(String unixPath){
        System.out.println("LongPath-->"+unixPath);
        Deque<String> stack = new ArrayDeque<>();

        List<String> pathStr = Arrays.stream(unixPath.split("/"))
                .filter(str -> !(str.equals("") || str.equals(".")))
                .collect(Collectors.toList());

         String[] pathStrs = (String []) Arrays.stream(unixPath.split("/"))
                .filter(str -> !(str.equals("") || str.equals(".")))
                .collect(Collectors.toList()).toArray(new String[0]);

        boolean isRootPath = unixPath.startsWith("/", 0);

        if(isRootPath){
            stack.push("");
        }

        for(int i=0; i < pathStrs.length; i++){
            if(pathStrs[i].equals("..")){
                String parentDir = stack.peek();
                if( parentDir != null && !(parentDir.equals("") || parentDir.equals(".."))){
                    stack.pop();
                }
                if(parentDir == null || parentDir.equals("..")){
                    stack.push(pathStrs[i]);
                }

            }else{
                stack.push(pathStrs[i]);
            }
        }

        if(stack.size() == 1 && stack.peek().equals("")){
            return "/";
        }

      List<String> s =   new ArrayList<>(stack);
      Collections.reverse(s);
      String shortenedPath = String.join("/", s);
      return shortenedPath;
    }
}
