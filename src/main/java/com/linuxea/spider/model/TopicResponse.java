package com.linuxea.spider.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author linuxea
 * @date 2019/7/31 14:12
 */
@NoArgsConstructor
@Data
public class TopicResponse {

  /**
   * error : [] extra : [] data :
   * {"list":[{"article_subtitle":"","audio_download_url":"https://static001.geekbang.org/resource/audio/39/8f/396277d45afcc72e79446ee77c21728f.mp3","id":103866,"had_viewed":true,"audio_size":4101990,"article_cover":"https://static001.geekbang.org/resource/image/86/44/86592bb648b65866c0cf721d95ba2544.jpg","audio_url":"https://res001.geekbang.org//media/audio/39/8f/396277d45afcc72e79446ee77c21728f/ld/ld.m3u8","article_summary":"让我们一起把内容交付这件事做好，为自己交付有意思的事情，为用户交付高品质的内容。","column_had_sub":true,"audio_dubber":"郭蕾","column_cover":"https://static001.geekbang.org/resource/image/33/6d/3371e5858d6f98ad62a7388fccbb926d.jpg","column_id":201,"audio_time":"00:07:10","audio_title":"编辑训练营开篇词","article_title":"开篇词
   * |
   * 把内容交付这件事做好","audio_md5":"396277d45afcc72e79446ee77c21728f","author_name":"郭蕾","article_sharetitle":"开篇词
   * |
   * 把内容交付这件事做好","column_bgcolor":"#F6F7FB","audio_time_arr":{"m":"07","s":"10","h":"00"},"chapter_id":"0","include_audio":true,"article_could_preview":true,"score":1561651200163,"article_ctime":1561651200},{"article_subtitle":"","audio_download_url":"https://static001.geekbang.org/resource/audio/32/d2/325f493e1b40302b18e2a01810d9acd2.mp3","id":103867,"had_viewed":true,"audio_size":11811134,"article_cover":"https://static001.geekbang.org/resource/image/f3/73/f3452e75d569ace78d487bdb57dde073.jpg","audio_url":"https://res001.geekbang.org//media/audio/32/d2/325f493e1b40302b18e2a01810d9acd2/ld/ld.m3u8","article_summary":"从事文字工作，应该有敬畏之心，始终坚持精益求精的态度，自身能力才能在不断发现问题、解决问题的过程中螺旋上升。","column_had_sub":true,"audio_dubber":"毛倩倩","column_cover":"https://static001.geekbang.org/resource/image/33/6d/3371e5858d6f98ad62a7388fccbb926d.jpg","column_id":201,"audio_time":"00:12:17","audio_title":"毛倩倩_编辑训练营","article_title":"01
   * |
   * 为什么说编辑要重视文字规范？","audio_md5":"325f493e1b40302b18e2a01810d9acd2","author_name":"毛倩倩","article_sharetitle":"01
   * |
   * 为什么说编辑要重视文字规范？","column_bgcolor":"#F6F7FB","audio_time_arr":{"m":"12","s":"17","h":"00"},"chapter_id":"0","include_audio":true,"article_could_preview":true,"score":1561651260465,"article_ctime":1561651260},{"article_subtitle":"","audio_download_url":"https://static001.geekbang.org/resource/audio/63/80/63cf1a74037ab889f50614797965c880.mp3","id":103868,"had_viewed":true,"audio_size":21068275,"article_cover":"https://static001.geekbang.org/resource/image/72/31/72bc679b2e903333ea87ac9553596b31.jpg","audio_url":"https://res001.geekbang.org//media/audio/63/80/63cf1a74037ab889f50614797965c880/ld/ld.m3u8","article_summary":"对于编辑来说，语言感知能力是基础敲门砖，不建立对语句结构的敏锐判决力，很难武装好你的思路。","column_had_sub":true,"audio_dubber":"曹倩芸","column_cover":"https://static001.geekbang.org/resource/image/33/6d/3371e5858d6f98ad62a7388fccbb926d.jpg","column_id":201,"audio_time":"00:21:56","audio_title":"02
   * | 如何发现并纠正文章语病？","article_title":"02 |
   * 如何发现并纠正文章语病？","audio_md5":"63cf1a74037ab889f50614797965c880","author_name":"曹倩芸","article_sharetitle":"02
   * |
   * 如何发现并纠正文章语病？","column_bgcolor":"#F6F7FB","audio_time_arr":{"m":"21","s":"56","h":"00"},"chapter_id":"0","include_audio":true,"article_could_preview":false,"score":1561651320663,"article_ctime":1561651320},{"article_subtitle":"","audio_download_url":"https://static001.geekbang.org/resource/audio/11/5e/1198f4e65dc562b0554ca0ee78278d5e.mp3","id":103870,"had_viewed":true,"audio_size":9178321,"article_cover":"https://static001.geekbang.org/resource/image/da/56/da0898a6ad489737bb98749bea03c456.jpg","audio_url":"https://res001.geekbang.org//media/audio/11/5e/1198f4e65dc562b0554ca0ee78278d5e/ld/ld.m3u8","article_summary":"技术采用生命周期是一个传播或者采用模型，横轴是时间，纵轴是对应时间内的具体采用人数。整个模型是一条钟形曲线。","column_had_sub":true,"audio_dubber":"郭蕾","column_cover":"https://static001.geekbang.org/resource/image/33/6d/3371e5858d6f98ad62a7388fccbb926d.jpg","column_id":201,"audio_time":"00:16:48","audio_title":"03技术采用生命周期","article_title":"03
   * |
   * 到底该怎么理解技术采用生命周期？","audio_md5":"1198f4e65dc562b0554ca0ee78278d5e","author_name":"郭蕾","article_sharetitle":"03
   * |
   * 到底该怎么理解技术采用生命周期？","column_bgcolor":"#F6F7FB","audio_time_arr":{"m":"16","s":"48","h":"00"},"chapter_id":"0","include_audio":true,"article_could_preview":false,"score":1561651380537,"article_ctime":1561651380},{"article_subtitle":"","audio_download_url":"https://static001.geekbang.org/resource/audio/ff/5f/ffd5e49050c78b784a14e989cc0f855f.mp3","id":103871,"had_viewed":true,"audio_size":11515964,"article_cover":"https://static001.geekbang.org/resource/image/4f/19/4fd3542ccec8bb3b48d014b145777e19.jpg","audio_url":"https://res001.geekbang.org//media/audio/ff/5f/ffd5e49050c78b784a14e989cc0f855f/ld/ld.m3u8","article_summary":"标题是文章的第一句话。
   * 这是我从业以来一直奉为真理的名言。","column_had_sub":true,"audio_dubber":"唐智","column_cover":"https://static001.geekbang.org/resource/image/33/6d/3371e5858d6f98ad62a7388fccbb926d.jpg","column_id":201,"audio_time":"00:11:59","audio_title":"小智_编辑训练营","article_title":"04
   * |
   * 如何取一个好的文章标题？","audio_md5":"ffd5e49050c78b784a14e989cc0f855f","author_name":"唐智","article_sharetitle":"04
   * |
   * 如何取一个好的文章标题？","column_bgcolor":"#F6F7FB","audio_time_arr":{"m":"11","s":"59","h":"00"},"chapter_id":"0","include_audio":true,"article_could_preview":false,"score":1561651440744,"article_ctime":1561651440},{"article_subtitle":"","audio_download_url":"https://static001.geekbang.org/resource/audio/a4/39/a4a086cb16adfe74b352e06d10eaa139.mp3","id":103873,"had_viewed":true,"audio_size":14764652,"article_cover":"https://static001.geekbang.org/resource/image/f6/e2/f6c7c0959f4eec672c84ac58f9c9d8e2.jpg","audio_url":"https://res001.geekbang.org//media/audio/a4/39/a4a086cb16adfe74b352e06d10eaa139/ld/ld.m3u8","article_summary":"我在成为编辑的第一天，我的主编就告诉我，写一篇好新闻是非常难的一件事儿，也是编辑必备的基本功。","column_had_sub":true,"audio_dubber":"张晓楠","column_cover":"https://static001.geekbang.org/resource/image/33/6d/3371e5858d6f98ad62a7388fccbb926d.jpg","column_id":201,"audio_time":"00:17:34","audio_title":"新闻","article_title":"05
   * |
   * 怎么才能写出一篇好新闻？","audio_md5":"a4a086cb16adfe74b352e06d10eaa139","author_name":"张晓楠","article_sharetitle":"05
   * |
   * 怎么才能写出一篇好新闻？","column_bgcolor":"#F6F7FB","audio_time_arr":{"m":"17","s":"34","h":"00"},"chapter_id":"0","include_audio":true,"article_could_preview":false,"score":1561651500759,"article_ctime":1561651500},{"article_subtitle":"","audio_download_url":"https://static001.geekbang.org/resource/audio/6b/64/6b1ad2e6793aaf2f566b1edbaf6db364.mp3","id":103874,"had_viewed":true,"audio_size":11766773,"article_cover":"https://static001.geekbang.org/resource/image/9d/fb/9d6c9378981c225a50cd15884b4535fb.jpg","audio_url":"https://res001.geekbang.org//media/audio/6b/64/6b1ad2e6793aaf2f566b1edbaf6db364/ld/ld.m3u8","article_summary":"如果说沟通有一个心法，我觉得就是坦诚。坦诚沟通不一定能解决所有的问题，但这是通往解决所有问题的唯一路径。","column_had_sub":true,"audio_dubber":"李佳","column_cover":"https://static001.geekbang.org/resource/image/33/6d/3371e5858d6f98ad62a7388fccbb926d.jpg","column_id":201,"audio_time":"00:16:20","audio_title":"和专家沟通出现冲突时，我该怎么办？-李佳","article_title":"06
   * |
   * 和专家沟通出现冲突时，我该怎么办？","audio_md5":"6b1ad2e6793aaf2f566b1edbaf6db364","author_name":"李佳","article_sharetitle":"06
   * |
   * 和专家沟通出现冲突时，我该怎么办？","column_bgcolor":"#F6F7FB","audio_time_arr":{"m":"16","s":"20","h":"00"},"chapter_id":"0","include_audio":true,"article_could_preview":false,"score":1561651560136,"article_ctime":1561651560}],"page":{"count":7,"more":false}}
   * code : 0
   */
  private DataEntity data;

  private int code;
  private List<?> error;
  private List<?> extra;

  @NoArgsConstructor
  @Data
  public static class DataEntity {
    /**
     * list :
     * [{"article_subtitle":"","audio_download_url":"https://static001.geekbang.org/resource/audio/39/8f/396277d45afcc72e79446ee77c21728f.mp3","id":103866,"had_viewed":true,"audio_size":4101990,"article_cover":"https://static001.geekbang.org/resource/image/86/44/86592bb648b65866c0cf721d95ba2544.jpg","audio_url":"https://res001.geekbang.org//media/audio/39/8f/396277d45afcc72e79446ee77c21728f/ld/ld.m3u8","article_summary":"让我们一起把内容交付这件事做好，为自己交付有意思的事情，为用户交付高品质的内容。","column_had_sub":true,"audio_dubber":"郭蕾","column_cover":"https://static001.geekbang.org/resource/image/33/6d/3371e5858d6f98ad62a7388fccbb926d.jpg","column_id":201,"audio_time":"00:07:10","audio_title":"编辑训练营开篇词","article_title":"开篇词
     * |
     * 把内容交付这件事做好","audio_md5":"396277d45afcc72e79446ee77c21728f","author_name":"郭蕾","article_sharetitle":"开篇词
     * |
     * 把内容交付这件事做好","column_bgcolor":"#F6F7FB","audio_time_arr":{"m":"07","s":"10","h":"00"},"chapter_id":"0","include_audio":true,"article_could_preview":true,"score":1561651200163,"article_ctime":1561651200},{"article_subtitle":"","audio_download_url":"https://static001.geekbang.org/resource/audio/32/d2/325f493e1b40302b18e2a01810d9acd2.mp3","id":103867,"had_viewed":true,"audio_size":11811134,"article_cover":"https://static001.geekbang.org/resource/image/f3/73/f3452e75d569ace78d487bdb57dde073.jpg","audio_url":"https://res001.geekbang.org//media/audio/32/d2/325f493e1b40302b18e2a01810d9acd2/ld/ld.m3u8","article_summary":"从事文字工作，应该有敬畏之心，始终坚持精益求精的态度，自身能力才能在不断发现问题、解决问题的过程中螺旋上升。","column_had_sub":true,"audio_dubber":"毛倩倩","column_cover":"https://static001.geekbang.org/resource/image/33/6d/3371e5858d6f98ad62a7388fccbb926d.jpg","column_id":201,"audio_time":"00:12:17","audio_title":"毛倩倩_编辑训练营","article_title":"01
     * |
     * 为什么说编辑要重视文字规范？","audio_md5":"325f493e1b40302b18e2a01810d9acd2","author_name":"毛倩倩","article_sharetitle":"01
     * |
     * 为什么说编辑要重视文字规范？","column_bgcolor":"#F6F7FB","audio_time_arr":{"m":"12","s":"17","h":"00"},"chapter_id":"0","include_audio":true,"article_could_preview":true,"score":1561651260465,"article_ctime":1561651260},{"article_subtitle":"","audio_download_url":"https://static001.geekbang.org/resource/audio/63/80/63cf1a74037ab889f50614797965c880.mp3","id":103868,"had_viewed":true,"audio_size":21068275,"article_cover":"https://static001.geekbang.org/resource/image/72/31/72bc679b2e903333ea87ac9553596b31.jpg","audio_url":"https://res001.geekbang.org//media/audio/63/80/63cf1a74037ab889f50614797965c880/ld/ld.m3u8","article_summary":"对于编辑来说，语言感知能力是基础敲门砖，不建立对语句结构的敏锐判决力，很难武装好你的思路。","column_had_sub":true,"audio_dubber":"曹倩芸","column_cover":"https://static001.geekbang.org/resource/image/33/6d/3371e5858d6f98ad62a7388fccbb926d.jpg","column_id":201,"audio_time":"00:21:56","audio_title":"02
     * | 如何发现并纠正文章语病？","article_title":"02 |
     * 如何发现并纠正文章语病？","audio_md5":"63cf1a74037ab889f50614797965c880","author_name":"曹倩芸","article_sharetitle":"02
     * |
     * 如何发现并纠正文章语病？","column_bgcolor":"#F6F7FB","audio_time_arr":{"m":"21","s":"56","h":"00"},"chapter_id":"0","include_audio":true,"article_could_preview":false,"score":1561651320663,"article_ctime":1561651320},{"article_subtitle":"","audio_download_url":"https://static001.geekbang.org/resource/audio/11/5e/1198f4e65dc562b0554ca0ee78278d5e.mp3","id":103870,"had_viewed":true,"audio_size":9178321,"article_cover":"https://static001.geekbang.org/resource/image/da/56/da0898a6ad489737bb98749bea03c456.jpg","audio_url":"https://res001.geekbang.org//media/audio/11/5e/1198f4e65dc562b0554ca0ee78278d5e/ld/ld.m3u8","article_summary":"技术采用生命周期是一个传播或者采用模型，横轴是时间，纵轴是对应时间内的具体采用人数。整个模型是一条钟形曲线。","column_had_sub":true,"audio_dubber":"郭蕾","column_cover":"https://static001.geekbang.org/resource/image/33/6d/3371e5858d6f98ad62a7388fccbb926d.jpg","column_id":201,"audio_time":"00:16:48","audio_title":"03技术采用生命周期","article_title":"03
     * |
     * 到底该怎么理解技术采用生命周期？","audio_md5":"1198f4e65dc562b0554ca0ee78278d5e","author_name":"郭蕾","article_sharetitle":"03
     * |
     * 到底该怎么理解技术采用生命周期？","column_bgcolor":"#F6F7FB","audio_time_arr":{"m":"16","s":"48","h":"00"},"chapter_id":"0","include_audio":true,"article_could_preview":false,"score":1561651380537,"article_ctime":1561651380},{"article_subtitle":"","audio_download_url":"https://static001.geekbang.org/resource/audio/ff/5f/ffd5e49050c78b784a14e989cc0f855f.mp3","id":103871,"had_viewed":true,"audio_size":11515964,"article_cover":"https://static001.geekbang.org/resource/image/4f/19/4fd3542ccec8bb3b48d014b145777e19.jpg","audio_url":"https://res001.geekbang.org//media/audio/ff/5f/ffd5e49050c78b784a14e989cc0f855f/ld/ld.m3u8","article_summary":"标题是文章的第一句话。
     * 这是我从业以来一直奉为真理的名言。","column_had_sub":true,"audio_dubber":"唐智","column_cover":"https://static001.geekbang.org/resource/image/33/6d/3371e5858d6f98ad62a7388fccbb926d.jpg","column_id":201,"audio_time":"00:11:59","audio_title":"小智_编辑训练营","article_title":"04
     * |
     * 如何取一个好的文章标题？","audio_md5":"ffd5e49050c78b784a14e989cc0f855f","author_name":"唐智","article_sharetitle":"04
     * |
     * 如何取一个好的文章标题？","column_bgcolor":"#F6F7FB","audio_time_arr":{"m":"11","s":"59","h":"00"},"chapter_id":"0","include_audio":true,"article_could_preview":false,"score":1561651440744,"article_ctime":1561651440},{"article_subtitle":"","audio_download_url":"https://static001.geekbang.org/resource/audio/a4/39/a4a086cb16adfe74b352e06d10eaa139.mp3","id":103873,"had_viewed":true,"audio_size":14764652,"article_cover":"https://static001.geekbang.org/resource/image/f6/e2/f6c7c0959f4eec672c84ac58f9c9d8e2.jpg","audio_url":"https://res001.geekbang.org//media/audio/a4/39/a4a086cb16adfe74b352e06d10eaa139/ld/ld.m3u8","article_summary":"我在成为编辑的第一天，我的主编就告诉我，写一篇好新闻是非常难的一件事儿，也是编辑必备的基本功。","column_had_sub":true,"audio_dubber":"张晓楠","column_cover":"https://static001.geekbang.org/resource/image/33/6d/3371e5858d6f98ad62a7388fccbb926d.jpg","column_id":201,"audio_time":"00:17:34","audio_title":"新闻","article_title":"05
     * |
     * 怎么才能写出一篇好新闻？","audio_md5":"a4a086cb16adfe74b352e06d10eaa139","author_name":"张晓楠","article_sharetitle":"05
     * |
     * 怎么才能写出一篇好新闻？","column_bgcolor":"#F6F7FB","audio_time_arr":{"m":"17","s":"34","h":"00"},"chapter_id":"0","include_audio":true,"article_could_preview":false,"score":1561651500759,"article_ctime":1561651500},{"article_subtitle":"","audio_download_url":"https://static001.geekbang.org/resource/audio/6b/64/6b1ad2e6793aaf2f566b1edbaf6db364.mp3","id":103874,"had_viewed":true,"audio_size":11766773,"article_cover":"https://static001.geekbang.org/resource/image/9d/fb/9d6c9378981c225a50cd15884b4535fb.jpg","audio_url":"https://res001.geekbang.org//media/audio/6b/64/6b1ad2e6793aaf2f566b1edbaf6db364/ld/ld.m3u8","article_summary":"如果说沟通有一个心法，我觉得就是坦诚。坦诚沟通不一定能解决所有的问题，但这是通往解决所有问题的唯一路径。","column_had_sub":true,"audio_dubber":"李佳","column_cover":"https://static001.geekbang.org/resource/image/33/6d/3371e5858d6f98ad62a7388fccbb926d.jpg","column_id":201,"audio_time":"00:16:20","audio_title":"和专家沟通出现冲突时，我该怎么办？-李佳","article_title":"06
     * |
     * 和专家沟通出现冲突时，我该怎么办？","audio_md5":"6b1ad2e6793aaf2f566b1edbaf6db364","author_name":"李佳","article_sharetitle":"06
     * |
     * 和专家沟通出现冲突时，我该怎么办？","column_bgcolor":"#F6F7FB","audio_time_arr":{"m":"16","s":"20","h":"00"},"chapter_id":"0","include_audio":true,"article_could_preview":false,"score":1561651560136,"article_ctime":1561651560}]
     * page : {"count":7,"more":false}
     */
    private PageEntity page;

    private List<ListEntity> list;

    @NoArgsConstructor
    @Data
    public static class PageEntity {
      /** count : 7 more : false */
      private int count;

      private boolean more;
    }

    @NoArgsConstructor
    @Data
    public static class ListEntity {
      /**
       * article_subtitle : audio_download_url :
       * https://static001.geekbang.org/resource/audio/39/8f/396277d45afcc72e79446ee77c21728f.mp3 id
       * : 103866 had_viewed : true audio_size : 4101990 article_cover :
       * https://static001.geekbang.org/resource/image/86/44/86592bb648b65866c0cf721d95ba2544.jpg
       * audio_url :
       * https://res001.geekbang.org//media/audio/39/8f/396277d45afcc72e79446ee77c21728f/ld/ld.m3u8
       * article_summary : 让我们一起把内容交付这件事做好，为自己交付有意思的事情，为用户交付高品质的内容。 column_had_sub : true
       * audio_dubber : 郭蕾 column_cover :
       * https://static001.geekbang.org/resource/image/33/6d/3371e5858d6f98ad62a7388fccbb926d.jpg
       * column_id : 201 audio_time : 00:07:10 audio_title : 编辑训练营开篇词 article_title : 开篇词 |
       * 把内容交付这件事做好 audio_md5 : 396277d45afcc72e79446ee77c21728f author_name : 郭蕾 article_sharetitle
       * : 开篇词 | 把内容交付这件事做好 column_bgcolor : #F6F7FB audio_time_arr : {"m":"07","s":"10","h":"00"}
       * chapter_id : 0 include_audio : true article_could_preview : true score : 1561651200163
       * article_ctime : 1561651200
       */
      private String article_subtitle;

      private String audio_download_url;
      private int id;
      private boolean had_viewed;
      private int audio_size;
      private String article_cover;
      private String audio_url;
      private String article_summary;
      private boolean column_had_sub;
      private String audio_dubber;
      private String column_cover;
      private int column_id;
      private String audio_time;
      private String audio_title;
      private String article_title;
      private String audio_md5;
      private String author_name;
      private String article_sharetitle;
      private String column_bgcolor;
      private AudioTimeArrEntity audio_time_arr;
      private String chapter_id;
      private boolean include_audio;
      private boolean article_could_preview;
      private long score;
      private int article_ctime;

      @NoArgsConstructor
      @Data
      public static class AudioTimeArrEntity {
        /** m : 07 s : 10 h : 00 */
        private String m;

        private String s;
        private String h;
      }
    }
  }
}
