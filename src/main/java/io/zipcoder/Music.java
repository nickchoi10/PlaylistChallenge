package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){


        int left=0;
        int right=0;
        int l=startIndex;
        int r=startIndex;

        for(int i =0; i< playList.length; i++){
            if(this.playList[l]==selection){
                return left;
            }else if(this.playList[r]==selection){
                return right;
            }
            l--;
            r++;
            if (l<0){
                l = playList.length-1;
            }
            if(r> playList.length-1);{
                r=0;
            }
            right++;
            left++;
        }


        return null;
    }
}
