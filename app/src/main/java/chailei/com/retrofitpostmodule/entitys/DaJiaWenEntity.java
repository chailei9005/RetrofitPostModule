package chailei.com.retrofitpostmodule.entitys;

import java.util.List;

/**
 * Created by Administrator on 16-1-22.
 */
public class DaJiaWenEntity {

    private int code;
    private String Msg;
    private List<ListEntity> list;

    public DaJiaWenEntity() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return Msg;
    }

    public void setMsg(String msg) {
        Msg = msg;
    }

    public List<ListEntity> getList() {
        return list;
    }

    public void setList(List<ListEntity> list) {
        this.list = list;
    }

    public static class ListEntity{
        private int catname;
        private int cid;
        private String stockcode;
        private String url;

        public int getCatname() {
            return catname;
        }

        public void setCatname(int catname) {
            this.catname = catname;
        }

        public int getCid() {
            return cid;
        }

        public void setCid(int cid) {
            this.cid = cid;
        }

        public String getStockcode() {
            return stockcode;
        }

        public void setStockcode(String stockcode) {
            this.stockcode = stockcode;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public ListEntity() {
        }
    }

    @Override
    public String toString() {
        return "DaJiaWenEntity{" +
                "code=" + code +
                ", Msg='" + Msg + '\'' +
                ", list=" + list +
                '}';
    }
}
