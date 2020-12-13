package com.linuxea.spider.model;

import java.util.List;

/**
 * @author linuxea
 * @date 2019/7/31 14:09
 */
@lombok.NoArgsConstructor
@lombok.Data
public class CourseResponse {

    private int code;

    private List<?> error;
    private List<?> extra;
    private List<DataEntity> data;

    @lombok.NoArgsConstructor
    @lombok.Data
    public static class DataEntity {
        private String title;

        private PageEntity page;
        private int id;
        private List<ListEntity> list;

        @lombok.NoArgsConstructor
        @lombok.Data
        public static class PageEntity {
            /**
             * count : 8 more : false
             */
            private int count;

            private boolean more;
        }

        @lombok.NoArgsConstructor
        @lombok.Data
        public static class ListEntity {
            private String title;

            private String cover;
            private ExtraEntity extra;
            private long score;
            private String type;

            @lombok.NoArgsConstructor
            @lombok.Data
            public static class ExtraEntity {
                private int view_article_count;
                private String author_name;
                private String column_title;
                private int last_aid;
                private String column_cover;
                private int sub_time;
                private boolean is_include_audio;
                private int column_id;
                private String column_subtitle;
                private String update_frequency;
                private int column_sku;
                private boolean had_sub;
                private String author_intro;
                private int article_count;
                private long score;
                private int column_type;
                private String author_header;
            }
        }
    }
}
