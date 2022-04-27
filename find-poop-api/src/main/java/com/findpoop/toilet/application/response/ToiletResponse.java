package com.findpoop.toilet.application.response;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class ToiletResponse implements Serializable {

    private ResponseData response;

    @Setter
    @Getter
    private static class ResponseData {
        private ResponseHeader header;
        private ResponseBody body;

        @Setter
        @Getter
        private static class ResponseHeader {
            private String resultCode;
            private String resultMsg;
            private String type;
        }

        @Setter
        @Getter
        private static class ResponseBody{
            private List<ToiletItem> items;
        }
    }


}
