package com.lqw.stack;

/**
 * 浏览器历史记录功能。
 */
public class BrowserHistory {

    /**
     * 新加入的页面存放这里
     */
    private Stack<String> head;

    /**
     * 回退的页面存放这里
     */
    private Stack<String> back;

    public BrowserHistory() {
        int size=5;
        head=new Stack<>(size);
        back=new Stack<>(size);
    }

    /**
     * 查看新页面
     * @param page
     */
    public void viewNew(String page){
        head.push(page);
        back.clean();
    }

    /**
     * 前进页面
     * @return
     */
    public String getHead(){
        String next = back.pop();
        head.push(next);
        return next;
    }

    /**
     * 回退页面
     * @return
     */
    public String getHistory(){
        String last = head.pop();
        back.push(last);
        return last;
    }

    public void clean(){
        head.clean();
        back.clean();
    }
}
