package sure.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by dell88 on 2017/2/23 0023.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}