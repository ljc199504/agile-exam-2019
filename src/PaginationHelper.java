package exam;

import java.util.List;

// TODO: 瀹屾垚杩欎釜绫�

public class PaginationHelper<I> {

    private List<I> collection
    private int itemsPerPage
    private int pageIndex
    private int itemIndex
    
    
    public PaginationHelper(List<I> collection, int itemsPerPage) {
    	this.collection = collection;
        this.itemPerPage = itemsPerPage;
        this.itemNum = collection.size();
        this.pagesNum = (int) Math.ceil((float) collection.size() / (float) itemPerPage);
    }

    /**
     * 杩斿洖collection涓墍鏈夊厓绱犵殑涓暟
     */
    public int itemCount() {
    	 return iremNum;
    }

    /**
     * 杩斿洖椤垫暟
     */
    public int pageCount() {
    	 return pagesNum;
    }

    /**
     * 杩斿洖褰撳墠椤祊ageIndex涓墍鍖呭惈鐨勫厓绱犱釜鏁�
     * pageIndex浠�0寮�濮嬭鏁�
     * 濡傛灉pageIndex涓洪潪娉曞�煎垯杩斿洖-1
     */
    public int pageItemCount(int pageIndex) {
    	 if (pageIndex >= pagesNum || pageIndex < 0) return -1;
         else if ((pageIndex + 1) * itemPerPage <= itemNum) return itemPerPage;
         else return itemNum % ((pageIndex) * itemPerPage);
    }

    /**
     * 杩斿洖绗琲temIndex涓厓绱犳墍鍦ㄧ殑椤垫暟
     * pageIndex浠�0寮�濮嬭鏁�
     * 濡傛灉itemIndex涓洪潪娉曞�煎垯杩斿洖-1
     */
    public int pageIndex(int itemIndex) {
    	if (itemIndex >= itemNum)  return -1;
        else if (itemIndex < 0) return 0; 
             else return itemIndex / itemPerPage;
    }
}