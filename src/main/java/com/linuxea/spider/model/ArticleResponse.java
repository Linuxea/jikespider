package com.linuxea.spider.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author linuxea
 * @date 2019/7/31 18:32
 */
@NoArgsConstructor
@Data
public class ArticleResponse {

    /**
     * error : []
     * extra : []
     * data : {"video_id":"","sku":"0","video_cover":"","author_name":"郑雨迪","text_read_version":1,"audio_size":3478682,"article_cover":"https://static001.geekbang.org/resource/image/f7/17/f7f927e2ff234c070424040da2b4ab17.jpg","product_type":"c1","audio_url":"https://res001.geekbang.org/media/audio/ce/ce/ce0e768ebc2940176a65dbef8dc184ce/ld/ld.m3u8","chapter_id":"589","column_had_sub":true,"audio_dubber":"郑雨迪","neighbors":{"left":[],"right":{"article_title":"01 | Java代码是怎么运行的？","id":11289}},"audio_time":"00:07:14","video_height":0,"article_content":"<p>前不久我参加了一个国外程序员的讲座，讲座的副标题很有趣，叫做：\u201c我如何学会停止恐惧，并且爱上Java虚拟机\u201d。<\/p>\n<p>这句话来自一部黑色幽默电影《奇爱博士》，电影描述了冷战时期剑拔弩张的氛围。<\/p>\n<p>程序员之间的语言之争又未尝不是如此。写系统语言的鄙视托管语言低下的执行效率；写托管语言的则取笑系统语言需要手动管理内存；写动态语言的不屑于静态语言那冗余的类型系统；写静态语言的则嘲讽动态语言里面各种光怪陆离的运行时错误。<\/p>\n<p>Java作为应用最广的语言，自然吸引了不少的攻击，而身为Java程序员的你，或许在口水战中落了下风，忿忿于没有足够的知识武装自己；又或许想要深入学习Java语言，却又无从下手。甚至是在实践中被Java的启动性能、内存耗费所震惊，因此对Java语言本身产生了种种的怀疑与顾虑。<\/p>\n<p>别担心，我就是来解答你对Java的种种疑虑的。\u201c知其然\u201d也要\u201c知其所以然\u201d，学习Java虚拟机的本质，更多是了解Java程序是如何被执行且优化的。这样一来，你才可以从内部入手，达到高效编程的目的。与此同时，你也可以为学习更深层级、更为核心的Java技术打好基础。<\/p>\n<p>我相信在不少程序员的观念里，Java虚拟机是透明的。在大家看来，我们仅需知道Java核心类库，以及第三方类库里API的用法，便可以专注于实现具体业务，并且依赖Java虚拟机自动执行乃至优化我们的应用程序。那么，我们还需要了解Java虚拟机吗？<\/p><!-- [[[read_end]]] -->\n<p>我认为是非常有必要的。如果我们把核心类库的API比做数学公式的话，那么Java虚拟机的知识就好比公式的推导过程。掌握数学公式固然可以应付考试，但是了解背后的推导过程更加有助于记忆和理解。并且，在遇到那些没法套公式的情况下，我们也能知道如何解决。<\/p>\n<p>具体来说，了解Java虚拟机有如下（但不限于）好处。<\/p>\n<p>首先，Java虚拟机提供了许多配置参数，用于满足不同应用场景下，对程序性能的需求。学习Java虚拟机，你可以针对自己的应用，最优化匹配运行参数。（你可以用下面这个例子看一下自己虚拟机的参数列表。）<\/p>\n<pre><code>举例来说，macOS上的Java 10共有近千个配置参数：\n\n$ java -XX:+PrintFlagsFinal -XX:+UnlockDiagnosticVMOptions -version | wc -l\njava version &quot;10&quot; 2018-03-20\nJava(TM) SE Runtime Environment 18.3 (build 10+46)\nJava HotSpot(TM) 64-Bit Server VM 18.3 (build 10+46, mixed mode)\n     812\n<\/code><\/pre>\n<p>其次，Java虚拟机本身是一种工程产品，在实现过程中自然存在不少局限性。学习Java虚拟机，可以更好地规避它在使用中的Bug，也可以更快地识别出Java虚拟机中的错误，<\/p>\n<p>再次，Java虚拟机拥有当前最前沿、最成熟的垃圾回收算法实现，以及即时编译器实现。学习Java虚拟机，我们可以了解背后的设计决策，今后再遇到其他代码托管技术也能触类旁通。<\/p>\n<p>最后，Java虚拟机发展到了今天，已经脱离Java语言，形成了一套相对独立的、高性能的执行方案。除了Java外，Scala、Clojure、Groovy，以及时下热门的Kotlin，这些语言都可以运行在Java虚拟机之上。学习Java虚拟机，便可以了解这些语言的通用机制，甚至于让这些语言共享生态系统。<\/p>\n<p>说起写作这个专栏的初心，与我个人的经历是分不开的，我现在是甲骨文实验室的高级研究员，工作主要是负责研究如何通过程序分析技术以及动态编译技术让程序语言跑得更快。明面上，我是Graal编译器的核心开发者之一，在为HotSpot虚拟机项目拧螺丝。<\/p>\n<p>这里顺便说明一下，Graal编译器是Java 10正式引入的实验性即时编译器，在国内同行口中被戏称为\u201c甲骨文黑科技\u201d。当然，在我看来，我们的工作同样也是分析应用程序的性能瓶颈，寻找优化空间，只不过我们的优化方式对自动化、通用性有更高的要求。<\/p>\n<p>加入甲骨文之前，我在瑞士卢加诺大学攻读博士学位，研究如何更加精准地监控Java程序，以便做出更具针对性的优化。这些研究工作均已发表在程序语言方向的顶级会议上，并获得了不少同行的认可（OOPSLA 2015最佳论文奖）。<\/p>\n<p>在这7年的学习工作生涯中，我拜读过许多大神关于Java虚拟机的技术博客。在受益匪浅的同时，我发觉不少文章的门槛都比较高，而且过分注重实现细节，这并不是大多数的开发人员可以受益的调优方案。这么一来，许多原本对Java虚拟机感兴趣的同学， 也因为过高的门槛，以及短时间内看不到的收益，而放弃了对Java虚拟机的学习。<\/p>\n<p>在收到极客时间的邀请后，我决定也挑战一下Java虚拟机的科普工作。和其他栏目一样，我会用简单通俗的语言，来介绍Java虚拟机的实现。具体到每篇文章，我将采用一个贯穿全文的案例来阐述知识点，并且给出相应的调优建议。在文章的末尾，我还将附上一个动手实践的环节，帮助你巩固对知识点的理解。<\/p>\n<p>整个专栏将分为四大模块。<\/p>\n<ol>\n<li><strong>基本原理<\/strong>：剖析Java虚拟机的运行机制，逐一介绍Java虚拟机的设计决策以及工程实现；<\/li>\n<li><strong>高效实现<\/strong>：探索Java编译器，以及内嵌于Java虚拟机中的即时编译器，帮助你更好地理解Java语言特性，继而写出简洁高效的代码；<\/li>\n<li><strong>代码优化<\/strong>：介绍如何利用工具定位并解决代码中的问题，以及在已有工具不适用的情况下，如何打造专属轮子；<\/li>\n<li><strong>虚拟机黑科技<\/strong>：介绍甲骨文实验室近年来的前沿工作之一GraalVM。包括如何在JVM上高效运行其他语言；如何混搭这些语言，实现Polyglot；如何将这些语言事前编译（Ahead-Of-Time，AOT）成机器指令，单独运行甚至嵌入至数据库中运行。<\/li>\n<\/ol>\n<p>我希望借由这四个模块36个案例，帮助你理解Java虚拟机的运行机制，掌握诊断手法和调优方式。最重要的，是激发你学习Java虚拟机乃至其他底层工作、前沿工作的热情。<\/p>\n<h2>知识框架图<\/h2>\n<p><img src=\"https://static001.geekbang.org/resource/image/41/77/414248014bf825dd610c3095eed75377.jpg\" alt=\"\" /><\/p>\n<p>（点击查看高清大图，iOS用户可长按保存）<\/p>\n","article_cover_hidden":false,"score":"1531735980000","video_media":"","audio_download_url":"https://res001.geekbang.org/resource/audio/ce/ce/ce0e768ebc2940176a65dbef8dc184ce.mp3","id":11074,"had_viewed":true,"article_title":"开篇词 | 为什么我们要学习Java虚拟机？","column_bgcolor":"#bbc4d9","column_cover":"https://static001.geekbang.org/resource/image/94/32/9411bedb8461e1384ccefadb3394fe32.jpg","article_sharetitle":"JVM第一课·为什么我们要学习Java虚拟机？","article_summary":"我希望借由这个专栏，帮助你理解Java虚拟机的运行机制，掌握诊断手法和调优方式。最重要的，是激发你学习技术的热情。","product_id":100010301,"article_poster_wxlite":"https://static001.geekbang.org/render/screen/2a/53/2a980514ec648566a4290b1ebbb31653.jpeg","like_count":396,"had_liked":false,"column_id":108,"audio_time_arr":{"m":"07","s":"14","h":"00"},"column_is_experience":false,"audio_title":"正式混音乐 1","audio_md5":"ce0e768ebc2940176a65dbef8dc184ce","video_size":0,"text_read_percent":102510081741,"article_could_preview":true,"cid":108,"article_subtitle":"无","view_count":80684,"video_width":0,"column_could_sub":true,"article_ctime":1531735980,"video_time":""}
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
         * video_id : sku : 0 video_cover : author_name : 郑雨迪 text_read_version : 1 audio_size : 3478682
         * article_cover :
         * https://static001.geekbang.org/resource/image/f7/17/f7f927e2ff234c070424040da2b4ab17.jpg
         * product_type : c1 audio_url :
         * https://res001.geekbang.org/media/audio/ce/ce/ce0e768ebc2940176a65dbef8dc184ce/ld/ld.m3u8
         * chapter_id : 589 column_had_sub : true audio_dubber : 郑雨迪 neighbors :
         * {"left":[],"right":{"article_title":"01 | Java代码是怎么运行的？","id":11289}} audio_time : 00:07:14
         * video_height : 0 article_content :
         *
         * <p>前不久我参加了一个国外程序员的讲座，讲座的副标题很有趣，叫做：“我如何学会停止恐惧，并且爱上Java虚拟机”。
         *
         * <p>这句话来自一部黑色幽默电影《奇爱博士》，电影描述了冷战时期剑拔弩张的氛围。
         *
         * <p>程序员之间的语言之争又未尝不是如此。写系统语言的鄙视托管语言低下的执行效率；写托管语言的则取笑系统语言需要手动管理内存；写动态语言的不屑于静态语言那冗余的类型系统；写静态语言的则嘲讽动态语言里面各种光怪陆离的运行时错误。
         *
         * <p>Java作为应用最广的语言，自然吸引了不少的攻击，而身为Java程序员的你，或许在口水战中落了下风，忿忿于没有足够的知识武装自己；又或许想要深入学习Java语言，却又无从下手。甚至是在实践中被Java的启动性能、内存耗费所震惊，因此对Java语言本身产生了种种的怀疑与顾虑。
         *
         * <p>别担心，我就是来解答你对Java的种种疑虑的。“知其然”也要“知其所以然”，学习Java虚拟机的本质，更多是了解Java程序是如何被执行且优化的。这样一来，你才可以从内部入手，达到高效编程的目的。与此同时，你也可以为学习更深层级、更为核心的Java技术打好基础。
         *
         * <p>我相信在不少程序员的观念里，Java虚拟机是透明的。在大家看来，我们仅需知道Java核心类库，以及第三方类库里API的用法，便可以专注于实现具体业务，并且依赖Java虚拟机自动执行乃至优化我们的应用程序。那么，我们还需要了解Java虚拟机吗？
         * <!-- [[[read_end]]] -->
         *
         * <p>我认为是非常有必要的。如果我们把核心类库的API比做数学公式的话，那么Java虚拟机的知识就好比公式的推导过程。掌握数学公式固然可以应付考试，但是了解背后的推导过程更加有助于记忆和理解。并且，在遇到那些没法套公式的情况下，我们也能知道如何解决。
         *
         * <p>具体来说，了解Java虚拟机有如下（但不限于）好处。
         *
         * <p>首先，Java虚拟机提供了许多配置参数，用于满足不同应用场景下，对程序性能的需求。学习Java虚拟机，你可以针对自己的应用，最优化匹配运行参数。（你可以用下面这个例子看一下自己虚拟机的参数列表。）
         *
         * <pre><code>举例来说，macOS上的Java 10共有近千个配置参数：
         *
         * $ java -XX:+PrintFlagsFinal -XX:+UnlockDiagnosticVMOptions -version | wc -l
         * java version &quot;10&quot; 2018-03-20
         * Java(TM) SE Runtime Environment 18.3 (build 10+46)
         * Java HotSpot(TM) 64-Bit Server VM 18.3 (build 10+46, mixed mode)
         * 812
         * </code></pre>
         *
         * <p>其次，Java虚拟机本身是一种工程产品，在实现过程中自然存在不少局限性。学习Java虚拟机，可以更好地规避它在使用中的Bug，也可以更快地识别出Java虚拟机中的错误，
         *
         * <p>再次，Java虚拟机拥有当前最前沿、最成熟的垃圾回收算法实现，以及即时编译器实现。学习Java虚拟机，我们可以了解背后的设计决策，今后再遇到其他代码托管技术也能触类旁通。
         *
         * <p>最后，Java虚拟机发展到了今天，已经脱离Java语言，形成了一套相对独立的、高性能的执行方案。除了Java外，Scala、Clojure、Groovy，以及时下热门的Kotlin，这些语言都可以运行在Java虚拟机之上。学习Java虚拟机，便可以了解这些语言的通用机制，甚至于让这些语言共享生态系统。
         *
         * <p>说起写作这个专栏的初心，与我个人的经历是分不开的，我现在是甲骨文实验室的高级研究员，工作主要是负责研究如何通过程序分析技术以及动态编译技术让程序语言跑得更快。明面上，我是Graal编译器的核心开发者之一，在为HotSpot虚拟机项目拧螺丝。
         *
         * <p>这里顺便说明一下，Graal编译器是Java
         * 10正式引入的实验性即时编译器，在国内同行口中被戏称为“甲骨文黑科技”。当然，在我看来，我们的工作同样也是分析应用程序的性能瓶颈，寻找优化空间，只不过我们的优化方式对自动化、通用性有更高的要求。
         *
         * <p>加入甲骨文之前，我在瑞士卢加诺大学攻读博士学位，研究如何更加精准地监控Java程序，以便做出更具针对性的优化。这些研究工作均已发表在程序语言方向的顶级会议上，并获得了不少同行的认可（OOPSLA
         * 2015最佳论文奖）。
         *
         * <p>在这7年的学习工作生涯中，我拜读过许多大神关于Java虚拟机的技术博客。在受益匪浅的同时，我发觉不少文章的门槛都比较高，而且过分注重实现细节，这并不是大多数的开发人员可以受益的调优方案。这么一来，许多原本对Java虚拟机感兴趣的同学，
         * 也因为过高的门槛，以及短时间内看不到的收益，而放弃了对Java虚拟机的学习。
         *
         * <p>在收到极客时间的邀请后，我决定也挑战一下Java虚拟机的科普工作。和其他栏目一样，我会用简单通俗的语言，来介绍Java虚拟机的实现。具体到每篇文章，我将采用一个贯穿全文的案例来阐述知识点，并且给出相应的调优建议。在文章的末尾，我还将附上一个动手实践的环节，帮助你巩固对知识点的理解。
         *
         * <p>整个专栏将分为四大模块。
         *
         * <ol>
         *   <li><strong>基本原理</strong>：剖析Java虚拟机的运行机制，逐一介绍Java虚拟机的设计决策以及工程实现；
         *   <li><strong>高效实现</strong>：探索Java编译器，以及内嵌于Java虚拟机中的即时编译器，帮助你更好地理解Java语言特性，继而写出简洁高效的代码；
         *   <li><strong>代码优化</strong>：介绍如何利用工具定位并解决代码中的问题，以及在已有工具不适用的情况下，如何打造专属轮子；
         *   <li><strong>虚拟机黑科技</strong>：介绍甲骨文实验室近年来的前沿工作之一GraalVM。包括如何在JVM上高效运行其他语言；如何混搭这些语言，实现Polyglot；如何将这些语言事前编译（Ahead-Of-Time，AOT）成机器指令，单独运行甚至嵌入至数据库中运行。
         * </ol>
         *
         * <p>我希望借由这四个模块36个案例，帮助你理解Java虚拟机的运行机制，掌握诊断手法和调优方式。最重要的，是激发你学习Java虚拟机乃至其他底层工作、前沿工作的热情。
         *
         * <h2>知识框架图</h2>
         *
         * <p><img
         * src="https://static001.geekbang.org/resource/image/41/77/414248014bf825dd610c3095eed75377.jpg"
         * alt="" />
         *
         * <p>（点击查看高清大图，iOS用户可长按保存） article_cover_hidden : false score : 1531735980000 video_media :
         * audio_download_url :
         * https://res001.geekbang.org/resource/audio/ce/ce/ce0e768ebc2940176a65dbef8dc184ce.mp3 id :
         * 11074 had_viewed : true article_title : 开篇词 | 为什么我们要学习Java虚拟机？ column_bgcolor : #bbc4d9
         * column_cover :
         * https://static001.geekbang.org/resource/image/94/32/9411bedb8461e1384ccefadb3394fe32.jpg
         * article_sharetitle : JVM第一课·为什么我们要学习Java虚拟机？ article_summary :
         * 我希望借由这个专栏，帮助你理解Java虚拟机的运行机制，掌握诊断手法和调优方式。最重要的，是激发你学习技术的热情。 product_id : 100010301
         * article_poster_wxlite :
         * https://static001.geekbang.org/render/screen/2a/53/2a980514ec648566a4290b1ebbb31653.jpeg
         * like_count : 396 had_liked : false column_id : 108 audio_time_arr :
         * {"m":"07","s":"14","h":"00"} column_is_experience : false audio_title : 正式混音乐 1 audio_md5 :
         * ce0e768ebc2940176a65dbef8dc184ce video_size : 0 text_read_percent : 102510081741
         * article_could_preview : true cid : 108 article_subtitle : 无 view_count : 80684 video_width :
         * 0 column_could_sub : true article_ctime : 1531735980 video_time :
         */
        private String video_id;

        private String sku;
        private String video_cover;
        private String author_name;
        private int text_read_version;
        private int audio_size;
        private String article_cover;
        private String product_type;
        private String audio_url;
        private String chapter_id;
        private boolean column_had_sub;
        private String audio_dubber;
        private NeighborsEntity neighbors;
        private String audio_time;
        private int video_height;
        private String article_content;
        private boolean article_cover_hidden;
        private String score;
        private String video_media;
        private String audio_download_url;
        private int id;
        private boolean had_viewed;
        private String article_title;
        private String column_bgcolor;
        private String column_cover;
        private String article_sharetitle;
        private String article_summary;
        private int product_id;
        private String article_poster_wxlite;
        private int like_count;
        private boolean had_liked;
        private int column_id;
        private AudioTimeArrEntity audio_time_arr;
        private boolean column_is_experience;
        private String audio_title;
        private String audio_md5;
        private int video_size;
        private long text_read_percent;
        private boolean article_could_preview;
        private int cid;
        private String article_subtitle;
        private int view_count;
        private int video_width;
        private boolean column_could_sub;
        private int article_ctime;
        private String video_time;

        @NoArgsConstructor
        @Data
        public static class NeighborsEntity {
            /**
             * left : [] right : {"article_title":"01 | Java代码是怎么运行的？","id":11289}
             */
            private RightEntity right;

            private List<?> left;

            @NoArgsConstructor
            @Data
            public static class RightEntity {
                /**
                 * article_title : 01 | Java代码是怎么运行的？ id : 11289
                 */
                private String article_title;

                private int id;
            }
        }

        @NoArgsConstructor
        @Data
        public static class AudioTimeArrEntity {
            /**
             * m : 07 s : 14 h : 00
             */
            private String m;

            private String s;
            private String h;
        }
    }
}
