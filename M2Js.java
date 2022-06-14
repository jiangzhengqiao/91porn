
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 解析 http://91porn.com/js/m.js
 * 获取实际m3u8地址
 * @author jiangzq
 * @return <source src='https://la.killcovid2021.com/m3u8/653951/653951.m3u8' type='application/x-mpegURL'>
 */
public class M2Js {
    private static String base64hash = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";

    public static void main(String[] args) throws Exception {
        String html = "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n" +
                "<html>\n" +
                " <head> \n" +
                "  <title>       \n" +
                "     Chinese homemade video</title> \n" +
                "  <meta http-equiv=\"Content-Type\" content=\"text/html;charset=utf-8\"> \n" +
                "  <meta name=\"description\" content=\"Free porn video, free amateur video, free xxx video\"> \n" +
                "  <meta name=\"keywords\" content=\"Free porn video, free amateur video, free xxx video\"> \n" +
                "  <meta name=\"RATING\" content=\"RTA-5042-1996-1400-1577-RTA\"> \n" +
                "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\"> \n" +
                "  <link rel=\"alternate\" type=\"application/rss+xml\" title=\"RSS - 20 newest videos\" href=\"rss/new/\"> \n" +
                "  <link rel=\"alternate\" type=\"application/rss+xml\" title=\"RSS - 20 most viewed videos\" href=\"rss/views/\"> \n" +
                "  <link rel=\"alternate\" type=\"application/rss+xml\" title=\"RSS - 20 most commented videos\" href=\"rss/comments/\"> \n" +
                "  <!--!!!!!!!!!!!!!!!!!!!!!!!! LIBRARY !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!--> \n" +
                "  <script type=\"text/javascript\">\n" +
                "var baseurl = 'http://91porn.com/';\n" +
                "var imgurl = 'http://91porn.com/images';\n" +
                "</script> \n" +
                "  <!-- !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! --> \n" +
                "  <!--!!!!!!!!!!!!!!!!!!!!!!!!! Processing SCRIPT !!!!!!!!!!!!!!!!!!!--> \n" +
                "  <script language=\"JavaScript\" src=\"/js/indexonly.js\" type=\"text/javascript\"></script> \n" +
                "  <script language=\"JavaScript\" src=\"/js/myjavascriptajax.js\" type=\"text/javascript\"></script> \n" +
                "  <script language=\"JavaScript\" src=\"/js/myjavascript.js\" type=\"text/javascript\"></script> \n" +
                "  <link href=\"/css/tpl_style.css?cache=202101014\" rel=\"stylesheet\" type=\"text/css\"> \n" +
                "  <link href=\"/css/upload-progress.css\" rel=\"stylesheet\" type=\"text/css\"> \n" +
                "  <!--coded mobile--> \n" +
                "  <link href=\"/css/mobile/bootstrap.css?id=2272331\" rel=\"stylesheet\"> \n" +
                "  <link href=\"/css/mobile/style.css?cache=202030513\" rel=\"stylesheet\"> \n" +
                "  <link href=\"/css/mobile/responsive.css\" rel=\"stylesheet\"> \n" +
                "  <link href=\"/css/mobile/font-awesome.min.css\" rel=\"stylesheet\"> \n" +
                "  <link href=\"/css/mobile/colors.css?cache=20200420\" rel=\"stylesheet\"> \n" +
                "  <link href=\"/css/mobile/custom.css?cache=20200420\" rel=\"stylesheet\"> \n" +
                "  <link href=\"/css/mobile/font-awesome.min.css\" rel=\"stylesheet\"> \n" +
                "  <!--coded mobile end--> \n" +
                "  <!--[if IE]><link href=\"/css/tpl_ie_6.css\"  rel=\"stylesheet\" type=\"text/css\" media=\"screen\" /><![endif]--> \n" +
                "  <!--[if IE 7]><link rel=\"stylesheet\" type=\"text/css\" href=\"/css/tpl_ie_7.css\" /><![endif]--> \n" +
                "  <script async src=\"/cdn-cgi/challenge-platform/h/g/scripts/invisible.js?ts=1655179200\"></script>\n" +
                " </head> \n" +
                " <body> \n" +
                "  <script type=\"text/javascript\" src=\"/js/jquery-1.11.3.min.js\"></script> \n" +
                "  <script type=\"text/javascript\" src=\"/js/bootstrap.min.js\"></script> \n" +
                "  <script type=\"text/javascript\" src=\"/js/jquery.cookie.js\"></script> \n" +
                "  <script type=\"text/javascript\" src=\"/js/overHang.min5.js\"></script> \n" +
                "  <script language=\"JScript\" type=\"text/jscript\" src=\"/js/rotator.js?cache=20210619\"></script> \n" +
                "  <div class=\"top-nav\"> \n" +
                "   <div class=\"container\"> \n" +
                "    <ul class=\"top-menu\"> \n" +
                "     <div class=\"pull-left\"> \n" +
                "      <form name=\"language_form\" method=\"POST\" action=\"\"> \n" +
                "       <select name=\"session_language\" onchange=\"document.language_form.submit();\"> <option value=\"en_US\">English</option> <option value=\"cn_CN\" selected>简体中文</option> <option value=\"zh_ZH\">繁體中文</option> </select> \n" +
                "      </form> \n" +
                "     </div> \n" +
                "     <div class=\"pull-right\"> \n" +
                "      <!--\n" +
                "          <li>欢迎,</li>\n" +
                "          --> \n" +
                "      <li> <a href=\"http://91porn.com/my_profile.php\">jiangzq</a> </li> \n" +
                "      <li> <a href=\"http://91porn.com/inbox.php\"> <img src=\"http://91porn.com/images/tpl_icon_message.gif\" border=\"0\">(0) </a> </li> \n" +
                "      <!--\n" +
                "          \n" +
                "          <li>\n" +
                "            <a href=\"http://91porn.com/yqm.php\">\n" +
                "              论坛邀请码\n" +
                "            </a>\n" +
                "          </li>\n" +
                "          --> \n" +
                "      <li> <a href=\"http://91porn.com/logout.php\"> 退出 </a> </li> \n" +
                "     </div> \n" +
                "     <!--<h1><a href=\"/\" title=\"Free  video\" class=\"logo\">Free  video</a></h1>--> \n" +
                "    </ul> \n" +
                "   </div> \n" +
                "  </div> \n" +
                "  <!-- end div head --> \n" +
                "  <div class=\"navbar navbar-inverse navbar-fixed-top\" role=\"navigation\"> \n" +
                "   <div class=\"container\"> \n" +
                "    <div class=\"navbar-header\"> \n" +
                "     <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-inverse-collapse\"> <span class=\"sr-only\">Toggle navigation</span> <span class=\"icon-bar\"></span> <span class=\"icon-bar\"></span> <span class=\"icon-bar\"></span> </button> \n" +
                "     <a class=\"navbar-brand\" href=\"/index.php\"><img src=\"/images/logo.png\"></a> \n" +
                "    </div> \n" +
                "    <div class=\"navbar-collapse collapse navbar-inverse-collapse\"> \n" +
                "     <ul class=\"nav navbar-nav navbar-right\"> \n" +
                "      <li><a href=\"https://up.workgreat11.live//upload.php?user_upload=ODI1NzYw!A,,|78ec75bc5f28809f9913287bd4b42514\">上传</a></li> \n" +
                "      <li><a href=\"http://91porn.com/v.php?next=watch\">视频</a></li> \n" +
                "      <li><a target=\"blank\" href=\"https://t0328.wonderfulday27.live\">自拍论坛</a></li> \n" +
                "      <li><a target=\"blank\" href=\"webcam.php\">美女视频</a></li> \n" +
                "      <li><a href=\"https://www.91831i.com/\">电影中心</a></li> \n" +
                "      <li><a href=\"pay.php\">VIP会员</a></li> \n" +
                "     </ul> \n" +
                "    </div> \n" +
                "   </div> \n" +
                "   <div class=\"submenu\"> \n" +
                "    <div class=\"container\"> \n" +
                "     <div class=\"navbar-collapse collapse navbar-inverse-collapse\"> \n" +
                "      <ul class=\"nav navbar-nav navbar-right\"> \n" +
                "       <li><a href=\"http://91porn.com/v.php?category=ori&amp;viewtype=basic\">91原创</a></li> \n" +
                "       <li><a href=\"http://91porn.com/v.php?category=hot&amp;viewtype=basic\">当前最热</a></li> \n" +
                "       <li><a href=\"http://91porn.com/v.php?category=top&amp;viewtype=basic\">本月最热</a></li> \n" +
                "       <li><a href=\"http://91porn.com/v.php?category=long&amp;viewtype=basic\">10分钟以上 </a></li> \n" +
                "       <li><a href=\"http://91porn.com/v.php?category=longer&amp;viewtype=basic\">20分钟以上 </a></li> \n" +
                "       <li><a href=\"http://91porn.com/v.php?category=tf&amp;viewtype=basic\">本月收藏</a></li> \n" +
                "       <li><a href=\"http://91porn.com/v.php?category=mf&amp;viewtype=basic\"> 收藏最多</a></li> \n" +
                "       <li><a href=\"http://91porn.com/v.php?category=rf&amp;viewtype=basic\">最近加精</a></li> \n" +
                "       <li><a href=\"http://91porn.com/v.php?category=hd&amp;viewtype=basic\">高清</a></li> \n" +
                "       <li><a href=\"http://91porn.com/v.php?category=top&amp;m=-1&amp;viewtype=basic\">上月最热</a></li> \n" +
                "       <li><a href=\"http://91porn.com/v.php?category=md&amp;viewtype=basic\">本月讨论</a></li> \n" +
                "      </ul> \n" +
                "     </div> \n" +
                "    </div> \n" +
                "   </div> \n" +
                "  </div> \n" +
                "  <!-- end div headnav --> \n" +
                "  <div>\n" +
                "   <style>\n" +
                ".ad_img{\n" +
                "  max-width: 1000px;\n" +
                " width: 100%;\n" +
                "align:center;\n" +
                "  height: auto;\n" +
                "}\n" +
                "\n" +
                "</style> \n" +
                "   <div align=\"center\"> \n" +
                "    <div class=\"cont6\" id=\"cont3\">\n" +
                "     <a href=\"https://hnhflqgc.com/daili91\" target=\"_blank\"><img class=\"ad_img\" src=\"https://fans.91p20.space/fans/1946000_1655028173.jpg\"></a>\n" +
                "    </div> \n" +
                "    <div class=\"cont6\" id=\"cont3\">\n" +
                "     <a href=\"https://www.zhao-zupu.com/wang90.htm\" target=\"_blank\"><img class=\"ad_img\" src=\"https://fans.91p20.space/fans/693836.gif\"></a>\n" +
                "    </div> \n" +
                "    <div class=\"cont6\" id=\"cont3\">\n" +
                "     <a href=\"https://www.e304a.com/daili11.htm\" target=\"_blank\"><img class=\"ad_img\" src=\"https://fans.91p20.space/fans/361dai.gif\"></a>\n" +
                "    </div> \n" +
                "    <div class=\"cont6\" id=\"cont3\">\n" +
                "     <a href=\"https://www.ludu319.com/vip1238899.htm\" target=\"_blank\"><img class=\"ad_img\" src=\"https://fans.91p20.space/fans/2481e.gif\"></a>\n" +
                "    </div> \n" +
                "    <div class=\"cont6\" id=\"cont3\">\n" +
                "     <a href=\"https://ursviken-sweden.com/91porn/\" target=\"_blank\"><img class=\"ad_img\" src=\"https://fans.91p20.space/fans/6117121.gif\"></a>\n" +
                "    </div> \n" +
                "    <div class=\"cont6\" id=\"cont3\">\n" +
                "     <a href=\"https://yiqimanyou.com/baobei.php\" target=\"_blank\"><img class=\"ad_img\" src=\"https://fans.91p20.space/fans/jiefu.gif\"></a>\n" +
                "    </div> \n" +
                "   </div>\n" +
                "  </div> \n" +
                "  <div id=\"wrapper\"> \n" +
                "   <div class=\"container container-minheight\"> \n" +
                "    <form id=\"searchForm\" class=\"form-inline\" action=\"http://91porn.com/search_result.php\" method=\"get\" name=\"searchForm\"> \n" +
                "     <div class=\"input-group\"> \n" +
                "      <input type=\"text\" class=\"text\" tabindex=\"1\" maxlength=\"22\" id=\"search_query\" name=\"search_id\" value=\"\"> \n" +
                "      <span class=\"search-select input-group-addon\"> <select class=\"select_back_white\" name=\"search_type\" tabindex=\"2\"> <option value=\"search_videos\">搜索视频</option> <option value=\"search_users\">搜索用户</option> <option value=\"search_video_id\">Video ID</option> <option value=\"date\">日期(2015-09-02)</option> </select> <input type=\"hidden\" name=\"min_duration\" value=\"\"> </span> \n" +
                "      <span class=\"input-group-btn\"> <button type=\"submit\" class=\"btn btn-primary custom-search-button\"><i class=\"fa fa-search\"></i></button> </span> \n" +
                "     </div> \n" +
                "    </form> \n" +
                "    <div id=\"clear\"></div> \n" +
                "    <!-- jqPagination styles --> \n" +
                "    <link rel=\"stylesheet\" href=\"/jquerypage/css/jqpagination.css\"> \n" +
                "    <link rel=\"stylesheet\" href=\"/css/voting.css\"> \n" +
                "    <!-- scripts --> \n" +
                "    <script src=\"/jquerypage/js/jquery-1.7.2.min.js\"></script> \n" +
                "    <script src=\"/jquerypage/js/jquery.jqpagination.js\"></script> \n" +
                "    <!-- shiv me up baby! --> \n" +
                "    <!--[if lt IE 9]>\n" +
                "          <script src=\"//html5shim.googlecode.com/svn/trunk/html5.js\"></script>\n" +
                "        <![endif]--> \n" +
                "    <script type=\"text/javascript\">\n" +
                " \n" +
                "          \n" +
                "          jQuery(document).ready(function() {\n" +
                "            var showChar = 3000;  // How many characters are shown by default\n" +
                "            var ellipsestext = \"...\";\n" +
                "            var moretext = \"Show more>>>\";\n" +
                "            var lesstext = \"Show less<<<\";\n" +
                "            $('.more').each(function() {\n" +
                "              var content = $(this).html();\n" +
                "              if(content.length > showChar) {\n" +
                "                var c = content.substr(0, showChar);\n" +
                "                var h = content.substr(showChar, content.length - showChar);\n" +
                "                var html = c + '<span class=\"moreellipses\">' + ellipsestext+ '&nbsp;</span><span class=\"morecontent\"><span>' + h + '</span>&nbsp;&nbsp;<a href=\"\" class=\"morelink\">' + moretext + '</a></span>';\n" +
                "                $(this).html(html);\n" +
                "              }        \n" +
                "            });\n" +
                "\n" +
                "\n" +
                "\t$(\"body\").on('click', \".add_favorite\", function(e) {\n" +
                "\t event.preventDefault();\n" +
                "\n" +
                "\tVID=$(\"#VID\").html();\n" +
                "\tUID=$(\"#UID\").html();\n" +
                "\tVUID=$(\"#VUID\").html();\n" +
                "\t\t\t\t\n" +
                "\n" +
                "\tif (UID==0)\n" +
                "\t\t$(\"#addToFavLogin\").show();\t\t\n" +
                "\t\t\n" +
                "\t$(\"#addToFavLink\").hide();\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\n" +
                "\n" +
                "\t\t\n" +
                "   $.ajax({\n" +
                "   method: \"POST\",\n" +
                "   datatype:\"text\",\n" +
                "   url: \"add_favorite.php\",\n" +
                "   data: {\n" +
                "\tVID, UID,VUID\n" +
                "  },\n" +
                "   success: function (response) {\n" +
                "\n" +
                " if(response==\"2\")\n" +
                "      {\n" +
                "      \t$(\"#addToFavAlready\").show();\n" +
                "      \t$(\"#addToFavSuccess\").hide();\n" +
                "      }\n" +
                " else if(response==\"3\")\n" +
                "      {\n" +
                "      \t$(\"#addToFav_verify\").show();\n" +
                "      \t$(\"#addToFavSuccess\").hide();\n" +
                "      }\n" +
                "      else\n" +
                "      {\n" +
                "      \t if (UID!=0)\n" +
                "\t\t$(\"#addToFavSuccess\").show();\n" +
                "      \n" +
                "      }\n" +
                "   }\n" +
                "\n" +
                "   });\n" +
                "\n" +
                "\n" +
                "\t});\n" +
                "\n" +
                "$(\".add_comment_main\").submit(function(event) {\n" +
                "\n" +
                "    /* Stop form from submitting normally */\n" +
                "    event.preventDefault();\n" +
                "\n" +
                "    /* Clear result div*/\n" +
                "    $(\"#comment_reply\").html('');\n" +
                "\n" +
                "    /* Get some values from elements on the page: */\n" +
                "    var values = $(this).serialize();\n" +
                "\n" +
                "var n=values.indexOf(\"comment_id\"); \n" +
                "  comment_id=values.substring(n+11,values.length);\n" +
                "    /* Send the data using post and put the results in a div */\n" +
                "    $.ajax({\n" +
                "        url: \"post_comment_main.php\",\n" +
                "        type: \"post\",\n" +
                "        data: values,\n" +
                "        success: function(){\n" +
                "           // alert(\"success\");\n" +
                "            $(\"#div_main_comment\").hide();\n" +
                "        $(\"#divComResult1\").show();\n" +
                "        },\n" +
                "        error:function(){\n" +
                "           // alert(\"failure\");\n" +
                "             $(\"#comment_reply_\"+ comment_id).html(\"ok\");\n" +
                "        }\n" +
                "    });\n" +
                "});\n" +
                "\n" +
                "\n" +
                "            \n" +
                "            $(\".morelink\").click(function(){\n" +
                "              if($(this).hasClass(\"less\")) {\n" +
                "                $(this).removeClass(\"less\");\n" +
                "                $(this).html(moretext);\n" +
                "              } else {\n" +
                "                $(this).addClass(\"less\");\n" +
                "                $(this).html(lesstext);\n" +
                "              }\n" +
                "              $(this).parent().prev().toggle();\n" +
                "              $(this).prev().toggle();\n" +
                "              return false;\n" +
                "            });\n" +
                "              \n" +
                "                          \n" +
                "            jQuery('.main_comment').html(\"<img src='images/spinner.gif'>\").load(\"show_comments2.php?VID=653951&start=1&comment_per_page=20\");\n" +
                "            jQuery('.pagination').jqPagination({\n" +
                "              link_string\t: '/?page={page_number}',\n" +
                "              max_page\t: 2,\n" +
                "              paged\t\t: function(page) {\n" +
                "                jQuery('.main_comment').html(\"<img src='images/spinner.gif'>\").load(\"show_comments2.php?VID=653951&start=\"+page+\"&comment_per_page=20\");\n" +
                "              }\n" +
                "            });\n" +
                "              \n" +
                "            \t\n" +
                "              \n" +
                "          });\n" +
                "          \n" +
                "        </script> \n" +
                "    <div class=\"row\"> \n" +
                "     <div class=\"col-md-8 col-ms-8 col-xs-12 video-border\"> \n" +
                "      <div id=\"videodetails\" class=\"videodetails-yakov\"> \n" +
                "       <h4 class=\"login_register_header\" align=\"left\"><img src=\"images/91.png\">  </h4>\n" +
                "       <br> \n" +
                "       <!-- JuicyAds v3.1 --> \n" +
                "       <script type=\"text/javascript\" data-cfasync=\"false\" async src=\"https://poweredby.jads.co/js/jads.js\"></script> \n" +
                "       <ins id=\"836083\" data-width=\"300\" data-height=\"112\"></ins> \n" +
                "       <script type=\"text/javascript\" data-cfasync=\"false\" async>(adsbyjuicy = window.adsbyjuicy || []).push({'adzone':836083});</script> \n" +
                "       <!--JuicyAds END--> \n" +
                "       <!-- JuicyAds v3.1 --> \n" +
                "       <script type=\"text/javascript\" data-cfasync=\"false\" async src=\"https://poweredby.jads.co/js/jads.js\"></script> \n" +
                "       <ins id=\"836084\" data-width=\"300\" data-height=\"112\"></ins> \n" +
                "       <script type=\"text/javascript\" data-cfasync=\"false\" async>(adsbyjuicy = window.adsbyjuicy || []).push({'adzone':836084});</script> \n" +
                "       <!--JuicyAds END-->\n" +
                "       <br>\n" +
                "       <div>\n" +
                "        <a href=\"http://hf18.cc/\" target=\"_blank\"><img class=\"ad_img\" src=\"https://fans.91p20.space/fans/13.gif\"></a>\n" +
                "       </div> \n" +
                "       <script language=\"JScript\" type=\"text/jscript\" src=\"/js/m.js\"></script> \n" +
                "       <script language=\"JScript\" type=\"text/jscript\" src=\"/js/m2.js\"></script> \n" +
                "       <link href=\"./videojs/css/videojs.min.css?t=2062270744\" rel=\"stylesheet\" type=\"text/css\"> \n" +
                "       <div class=\"video-container\"> \n" +
                "        <video id=\"player_one\" class=\"video-js vjs-sublime-skin vjs-16-9\" preload=\"auto\" width=\"100%\" controls poster=\"https://img.91p51.com/thumb/653951.jpg\" data-setup=\"{}\"> \n" +
                "         <!-- \n" +
                "\t            <source src=\"https://ccm.91p52.com/358999.mp4?st=6dX3e0ya0njWeGIALSBPrA&f=ed08LJ7jxrtD3siJbLVA5QnVBHx2NHF/Y937gfcALELYsZQ4OxoLTI9HNGk6K7pCiKaORleJhB9CrfSSFOWPGqrXYkhVHQe+p/xp\" type='video/mp4'>\n" +
                "\t             --> \n" +
                "         <script>\n" +
                "\t  \t          \t <!--\n" +
                "\t  \t                \t document.write(strencode(\"ZCl/T1IifgQKMitCBwkMUgNFHEQHLwkbPwZ7Li43cgE1Rz4EMwsWLDQ8HxkBAAoyfjB/WgoKRxAqMQMCA3RTVyAkH3AiFRcRBSEzPSogLTY1J1s+KiMEAA8mHx5ULANeLGIJLlApFTQYcxJoVTYITHpJUxoyOStUPlUXOB00F18=\",\"4a196z4nPai8ddAkIwttcgKapoCXLp7tTuRwQLXZPQsrLjKK3cJ0h8wfHeM3L7kenpRElARgKKfGetxNyJkDNwcnFnM+7kVgfPOY3nmDAATX\",\"ZCl/T1IifgQKMitCBwkMUgNFHEQHLwkbPwZ7Li43cgE1Rz4EMwsWLDQ8HxkBAAoyfjB/WgoKRxAqMQMCA3RTVyAkH3AiFRcRBSEzPSogLTY1J1s+KiMEAA8mHx5ULANeLGIJLlApFTQYcxJoVTYITHpJUxoyOStUPlUXOB00F18=1\"));\n" +
                "\t  \t          \t //-->\n" +
                "\t  \t  \t  </script> \n" +
                "         <p class=\"vjs-no-js\"> To view this video please enable JavaScript, and consider upgrading to a web browser that <a href=\"http://videojs.com/html5-video-support/\" target=\"_blank\">supports HTML5 video</a> </p> \n" +
                "        </video> \n" +
                "       </div> \n" +
                "       <script type=\"text/javascript\" src=\"./videojs/video.min.js\"></script> \n" +
                "       <script type=\"text/javascript\" src=\"./videojs/nuevo.min.js\"></script> \n" +
                "       <script type=\"text/javascript\" src=\"./videojs/plugins/videojs.pip.js\"></script> \n" +
                "       <script type=\"text/javascript\" src=\"./videojs/plugins/videojs-seek-buttons.js\"></script> \n" +
                "       <link href=\"./videojs/plugins/videojs-seek-buttons.css?c=1223\" rel=\"stylesheet\" type=\"text/css\"> \n" +
                "       <script>\n" +
                "\t\tvar player = videojs('player_one');\n" +
                "\t\tplayer.nuevo({ \n" +
                "\t\t\tlogotitle:'VAST Videojs example',\n" +
                "\t\t\tlogo: 'images/logo1.png',\n" +
                "\t\t\tlogoposition:'RT',\n" +
                "\t\t\tlogourl:'https://www.91porn.com'\n" +
                "\t\t} );\n" +
                "\t\n" +
                "\t\tplayer.preroll({ \n" +
                "\t\t\t\t\t\t\n" +
                "\t\t\tsrc:{ src:\"https://vthumb.killcovid2021.com/381.mp4\",type:\"video/mp4\"} ,\n" +
                "\t\t\thref:\"https://qise100.com\",\n" +
                "\t\t\tskipTime:5\n" +
                "\t\t\t\t\t} );\n" +
                "\tplayer.pip();\n" +
                "\tplayer.seekButtons({ \n" +
                "  \t    \t    forward: 10,\n" +
                "  \t    back: 10\n" +
                "   \n" +
                " \t } );\n" +
                "\t\n" +
                "\t\n" +
                "\t</script> \n" +
                "      </div> \n" +
                "      <div class=\"clear\"></div> \n" +
                "      <div id=\"useraction\"> \n" +
                "       <div class=\"boxPart\"> \n" +
                "        <span class=\"info\">时长: <span class=\"video-info-span\">06:16</span></span>&nbsp; \n" +
                "        <span class=\"info\"> 查看: <span class=\"video-info-span\">115865 </span></span>&nbsp; \n" +
                "        <span class=\"info\"> 留言: <span class=\"video-info-span\">30 </span></span>&nbsp; \n" +
                "        <span class=\"info\"> 收藏: <span class=\"video-info-span\">811 </span></span>&nbsp; \n" +
                "        <span class=\"info\"> 积分: <span class=\"video-info-span\">2000</span></span> \n" +
                "       </div> \n" +
                "       <div class=\"boxPart\"> \n" +
                "        <script type=\"text/javascript\" src=\"/js/vote.js?id=131\"></script> \n" +
                "        <div class=\"floatmenu\"> \n" +
                "         <form action=\"\" method=\"post\" id=\"de095LvXd27l7iPeDOhA3kahvrSCok1ro5ZFBhkzgb2peZ96VxE2nvMjBA\"> \n" +
                "          <input type=\"hidden\" name=\"post_id\" id=\"VID\" value=\"de095LvXd27l7iPeDOhA3kahvrSCok1ro5ZFBhkzgb2peZ96VxE2nvMjBA\"> \n" +
                "          <div class=\"like-dislike\"> \n" +
                "           <div class=\"like\">\n" +
                "            <div class=\"counter\">\n" +
                "             48\n" +
                "            </div>\n" +
                "           </div> \n" +
                "           <div class=\"dislike\">\n" +
                "            <div class=\"counter\">\n" +
                "             9\n" +
                "            </div>\n" +
                "           </div> \n" +
                "           <div class=\"clearfix\"></div> \n" +
                "          </div> \n" +
                "          <div class=\"clearfix\"></div> \n" +
                "         </form> \n" +
                "         <div id=\"voteProcessthank\" style=\"display:none\">\n" +
                "          Thanks for rating\n" +
                "         </div> \n" +
                "        </div> \n" +
                "        <div class=\"floatmenu\"> \n" +
                "         <div id=\"addToFavLink\"> \n" +
                "          <form id=\"favorite\"> \n" +
                "           <div id=\"UID\" style=\"display:none;\">\n" +
                "            8257600\n" +
                "           </div> \n" +
                "           <div id=\"VID\" style=\"display:none;\">\n" +
                "            653951\n" +
                "           </div> \n" +
                "           <div id=\"VUID\" style=\"display:none;\">\n" +
                "            de095LvXd27l7iPeDOhA3kahvrSCok1ro5ZFBhkzgb2peZ96VxE2nvMjBA\n" +
                "           </div> \n" +
                "           <div id=\"addToFavLink\">\n" +
                "            <a href=\"#\" class=\"add_favorite\">加为收藏</a>\n" +
                "           </div> \n" +
                "          </form> \n" +
                "         </div> \n" +
                "         <div id=\"addToFavSuccess\" style=\"display:none;\">\n" +
                "          收藏成功!\n" +
                "         </div> \n" +
                "         <div id=\"addToFavFailed\" style=\"display:none;\">\n" +
                "          收藏失败!\n" +
                "         </div> \n" +
                "         <div id=\"addToFavAlready\" style=\"display:none;\">\n" +
                "          已经添加过!\n" +
                "         </div> \n" +
                "         <div id=\"addToFav_verify\" style=\"display:none;\">\n" +
                "          <a href=\"confirm_email.php\">请邮箱验证</a>\n" +
                "         </div> \n" +
                "         <div id=\"addToFavLogin\" style=\"display:none;\"> \n" +
                "          <a href=\"http://91porn.com/login.php\">登录收藏!</a> \n" +
                "         </div> \n" +
                "         <div id=\"addToFavOwner\" style=\"display:none;\">\n" +
                "          不能收藏你自己的视频!\n" +
                "         </div> \n" +
                "        </div> \n" +
                "        <div class=\"floatmenu\"> \n" +
                "         <a href=\"#postcomment\">留言</a> \n" +
                "        </div> \n" +
                "        <div class=\"floatmenu\">\n" +
                "          vip用戶可下载此视频 \n" +
                "        </div> \n" +
                "        <div class=\"floatmenu\"> \n" +
                "         <a href=\"remove.php?viewkey=e6f1e55a65ca32ddee69\">举报删除该视频</a> \n" +
                "        </div> \n" +
                "       </div> \n" +
                "       <div id=\"videodetails-content\"> \n" +
                "        <img src=\"images/hd.png\">&nbsp;\n" +
                "        <a href=\"view_video_hd.php?viewkey=e6f1e55a65ca32ddee69\">此视频有高清版本，点此观看</a>\n" +
                "        <br> 声明: \n" +
                "        <a href=\"https://p.w27.rocks/p2.php\">91PORN旗下视频聊天</a>消费，可以获得最高6级VIP \n" +
                "        <br>缓冲速度慢，或者无法观看视频，尝试\n" +
                "        <a href=\"speed.php\">选择不同的播放线路</a> \n" +
                "        <br>注意保护隐私。拒绝转帖、乱伦、暴力、偷拍、吸毒、迷奸和未成年(18周岁以下)\n" +
                "        <br> \n" +
                "        <font color=\"red\">上传有风险，注意保护隐私，你的影片可能会被其他人下载或转发。 </font>\n" +
                "        <br> 为了安全，不要使用微信或者qq。建议使用telegram或者whatsapp等国外软件. \n" +
                "       </div> \n" +
                "       <div class=\"clear\"></div> \n" +
                "      </div> \n" +
                "      <div id=\"videodetails\" class=\"videodetails-yakov\"> \n" +
                "       <h4 class=\"login_register_header\">视频信息<br> </h4>\n" +
                "       <br> \n" +
                "       <div id=\"videodetails-content\"> \n" +
                "        <div> \n" +
                "         <span class=\"info\">添加时间: </span> \n" +
                "         <span class=\"title-yakov\">2022-06-10</span>&nbsp;&nbsp;***精品视频加分+2000\n" +
                "         <br> \n" +
                "        </div> \n" +
                "        <div> \n" +
                "         <span class=\"info\">作者: </span> \n" +
                "         <span class=\"title-yakov\"> <a href=\"http://91porn.com/uprofile.php?UID=cb2dsTwJ1Ei8guxo3i0s7Cha8MZ9lnJ6eQbIeY9WGUKlZk2YzQ\"><span class=\"title\">luoshuimiao</span></a><a href=\"javascript:void(0);\"><i class=\"my_icon daren\" title=\"自拍达人\"></i></a> </span> (\n" +
                "         <a href=\"compose.php?receiver=luoshuimiao\"> 发送消息 </a>) &nbsp;&nbsp; 自拍达人   \n" +
                "         <a href=\"http://91porn.com/uprofile.php?UID=cb2dsTwJ1Ei8guxo3i0s7Cha8MZ9lnJ6eQbIeY9WGUKlZk2YzQ\">点此关注 </a> \n" +
                "        </div> \n" +
                "        <span class=\"title\">注册:196天前&nbsp;&nbsp;级别:1&nbsp;&nbsp;积分:2600&nbsp;&nbsp;视频:<a href=\"uvideos.php?UID=cb2dsTwJ1Ei8guxo3i0s7Cha8MZ9lnJ6eQbIeY9WGUKlZk2YzQ&amp;type=public\">8</a> &nbsp;&nbsp;粉丝:20013&nbsp;&nbsp;关注:<a href=\"user_followed.php?UID=cb2dsTwJ1Ei8guxo3i0s7Cha8MZ9lnJ6eQbIeY9WGUKlZk2YzQ\">1</a><br><br> \n" +
                "         <div> \n" +
                "          <span class=\"info\">简介（<b><font color=\"red\">⇓⇓请注意简介里的联系方式，不要被骗。以下内容是与本站无关的广告！⇓⇓</font></b>）: <br></span> \n" +
                "          <span class=\"more title\"> 喜欢喵喵的先收藏好评支持一下，本人唯一推特：luoshuimiao<br><br>------------官方推荐MM陪玩约炮神器-----------------<br>官方唯一推荐--FY39.cc<br><br>全国同城附近人约炮平台，高端外围上门<br>网址：FY39.cc<br>限时免费注册免费约一次<br>平台小姐姐都带认证，很靠谱<br>视频中这些女的就是再mm陪玩约的！<br><br>《完整版，更多此视频可以去网址FY39.cc 下载APP进行观看》<br>《完整版，更多此视频可以去网址FY39.cc 下载APP进行观看》<br>《完整版，更多此视频可以去网址FY39.cc 下载APP进行观看》<br><br><br>mm陪玩服务项目--同城附近匹配约--高端外围上门--高端包养伴游--1v1定制裸聊--各大神完整版定制--您出差外地，疫情隔离必备神器<br><br>ps:GG陪玩现在招女孩，男模（要求气质佳）(不能下载或投诉)可以联系官方邮箱<a href=\"/cdn-cgi/l/email-protection\" class=\"__cf_email__\" data-cfemail=\"c2faf4f7f7f1f3fa82a5afa3abaeeca1adaf\">[email&nbsp;protected]</a><br> </span> \n" +
                "         </div> </span>\n" +
                "       </div> \n" +
                "       <form id=\"linkForm2\" name=\"linkForm2\"> \n" +
                "        <div class=\"yavko-above-embed-url\"> \n" +
                "         <span class=\"title\"><br>视频分享(<font color=\"red\">禁止分享在未成年可能看到的地方</font>)html5 :</span> \n" +
                "        </div> \n" +
                "        <textarea rows=\"2\" name=\"video_link\" id=\"fm-video_link\" class=\"fullboxtext\" onclick=\"javascript:document.linkForm2.video_link.focus();document.linkForm2.video_link.select();\" readonly>http://91.9p9.xyz/ev.php?VID=de095LvXd27l7iPeDOhA3kahvrSCok1ro5ZFBhkzgb2peZ96VxE2nvMjBA</textarea> \n" +
                "       </form> \n" +
                "       <div class=\"clear\"></div> \n" +
                "      </div> \n" +
                "      <div id=\"videodetails\" class=\"videodetails-yakov\"> \n" +
                "       <h4 class=\"login_register_header\">此视频留言<br> </h4>\n" +
                "       <br> \n" +
                "       <div id=\"videodetails-content\"> \n" +
                "        <a name=\"postcomment\"></a> \n" +
                "        <div id=\"divComments\">\n" +
                "          留言(不允许发布任何交友信息及联系方式如qq，电话，email或站内私聊等)\n" +
                "         <br>\n" +
                "         <font color=\"red\">发布与本视频无关的评论一律禁言！</font>: \n" +
                "         <br> \n" +
                "         <form class=\"add_comment_main\"> \n" +
                "          <div id=\"div_main_comment\"> \n" +
                "           <input type=\"hidden\" name=\"UID\" value=\"8257600\"> \n" +
                "           <input type=\"hidden\" name=\"VID\" value=\"653951\"> \n" +
                "           <textarea rows=\"6\" name=\"comment\" id=\"txtComments\" class=\"fullboxtext \" placeholder=\"禁止发布任何与视频无关的评论，发布类似\n" +
                " 北京骚女联系我 ，山东有约吗， 上海dd\n" +
                "等会被禁言。\n" +
                "发布任何联系方式会被禁言。\"></textarea>\n" +
                "           <br> \n" +
                "           <input type=\"submit\" class=\"btn btn-primary\" value=\"发布留言\"> \n" +
                "          </div> \n" +
                "         </form> \n" +
                "        </div> \n" +
                "        <br> \n" +
                "        <div id=\"divComResult1\" style=\"display:none\"> \n" +
                "         <p><font color=\"green\">留言已经提交，稍后显示，请不要重复提交！</font></p> \n" +
                "        </div> \n" +
                "        <div id=\"divComResult2\" style=\"display:none\"> \n" +
                "         <p>你已经在这个视频下留言过.</p> \n" +
                "        </div> \n" +
                "        <div id=\"divComResult3\" style=\"display:none\"> \n" +
                "         <p>不允许留言!</p> \n" +
                "        </div> \n" +
                "        <div class=\"main_comment\"></div> \n" +
                "        <div class=\"gigantic pagination\"> \n" +
                "         <a href=\"#\" class=\"first\" data-action=\"first\">«</a> \n" +
                "         <a href=\"#\" class=\"previous\" data-action=\"previous\">‹</a> \n" +
                "         <input type=\"text\" readonly> \n" +
                "         <a href=\"#\" class=\"next\" data-action=\"next\">›</a> \n" +
                "         <a href=\"#\" class=\"last\" data-action=\"last\">»</a> \n" +
                "        </div> \n" +
                "       </div> \n" +
                "      </div> \n" +
                "     </div> \n" +
                "     <div class=\"col-md-4 col-ms-4 col-xs-12\"> \n" +
                "      <h3 class=\"login_register_header\">本月热播中</h3>\n" +
                "      <br> \n" +
                "      <div id=\"row\"> \n" +
                "       <!-- JuicyAds v3.1 --> \n" +
                "       <script data-cfasync=\"false\" src=\"/cdn-cgi/scripts/5c5dd728/cloudflare-static/email-decode.min.js\"></script>\n" +
                "       <script type=\"text/javascript\" data-cfasync=\"false\" async src=\"https://poweredby.jads.co/js/jads.js\"></script> \n" +
                "       <ins id=\"848863\" data-width=\"300\" data-height=\"262\"></ins> \n" +
                "       <script type=\"text/javascript\" data-cfasync=\"false\" async>(adsbyjuicy = window.adsbyjuicy || []).push({'adzone':848863});</script> \n" +
                "       <!--JuicyAds END--> \n" +
                "       <br> \n" +
                "       <!-- JuicyAds v3.1 --> \n" +
                "       <script type=\"text/javascript\" data-cfasync=\"false\" async src=\"https://poweredby.jads.co/js/jads.js\"></script> \n" +
                "       <ins id=\"393392\" data-width=\"300\" data-height=\"250\"></ins> \n" +
                "       <script type=\"text/javascript\" data-cfasync=\"false\" async>(adsbyjuicy = window.adsbyjuicy || []).push({'adzone':393392});</script> \n" +
                "       <!--JuicyAds END--> \n" +
                "       <br>\n" +
                "       <br> \n" +
                "       <div class=\"well well-sm\"> \n" +
                "        <a href=\"http://91porn.com/view_video.php?viewkey=3fb9af5a0891b9551d8c\"> \n" +
                "         <div class=\"thumb-overlay\" id=\"playvthumb_655623\"> \n" +
                "          <img class=\"img-responsive\" src=\"https://i.91p30.com/thumb/655623.jpg\"> \n" +
                "          <div class=\"hd-text-icon\">\n" +
                "           HD\n" +
                "          </div> \n" +
                "          <div class=\"original-text-icon\">\n" +
                "           91\n" +
                "          </div> \n" +
                "          <span class=\"duration\">02:18</span> \n" +
                "         </div> <span class=\"video-title title-truncate m-t-5\">[原创] 欲求不满肥臀熟女阿姨性瘾太大了 都无法满足自己怎么办啊28秒日期验证</span> </a> \n" +
                "        <div class=\"video-views pull-left\"> \n" +
                "         <span class=\"info\">添加时间:</span> 3 小时 前\n" +
                "         <br> \n" +
                "         <span class=\"info\">作者:</span> mxl0333\n" +
                "         <br> \n" +
                "         <span class=\"info\">查看:</span> 4457 \n" +
                "         <span class=\"info\">收藏:</span> 18\n" +
                "         <br>\n" +
                "         <span class=\"info\">留言:</span> 6 &nbsp;&nbsp; \n" +
                "         <img src=\"images/like.png\" height=\"10\">6&nbsp; \n" +
                "         <img src=\"images/dislike.png\" height=\"10\"> 4 \n" +
                "        </div> \n" +
                "       </div> \n" +
                "       <div class=\"well well-sm\"> \n" +
                "        <a href=\"http://91porn.com/view_video.php?viewkey=450eec482312ff2263d9\"> \n" +
                "         <div class=\"thumb-overlay\" id=\"playvthumb_655589\"> \n" +
                "          <img class=\"img-responsive\" src=\"https://i.91p30.com/thumb/655589.jpg\"> \n" +
                "          <div class=\"hd-text-icon\">\n" +
                "           HD\n" +
                "          </div> \n" +
                "          <span class=\"duration\">03:38</span> \n" +
                "         </div> <span class=\"video-title title-truncate m-t-5\">20公分大鸡巴狂操大二体育生,人间尤物,身材极品</span> </a> \n" +
                "        <div class=\"video-views pull-left\"> \n" +
                "         <span class=\"info\">添加时间:</span> 5 小时 前\n" +
                "         <br> \n" +
                "         <span class=\"info\">作者:</span> paxlovegirl\n" +
                "         <br> \n" +
                "         <span class=\"info\">查看:</span> 9469 \n" +
                "         <span class=\"info\">收藏:</span> 200\n" +
                "         <br>\n" +
                "         <span class=\"info\">留言:</span> 4 &nbsp;&nbsp; \n" +
                "         <img src=\"images/like.png\" height=\"10\">8&nbsp; \n" +
                "         <img src=\"images/dislike.png\" height=\"10\"> 2 \n" +
                "        </div> \n" +
                "       </div> \n" +
                "       <div class=\"well well-sm\"> \n" +
                "        <a href=\"http://91porn.com/view_video.php?viewkey=bf3ef534f1fd2454a54f\"> \n" +
                "         <div class=\"thumb-overlay\" id=\"playvthumb_655597\"> \n" +
                "          <img class=\"img-responsive\" src=\"https://i.91p30.com/thumb/655597.jpg\"> \n" +
                "          <div class=\"hd-text-icon\">\n" +
                "           HD\n" +
                "          </div> \n" +
                "          <span class=\"duration\">10:38</span> \n" +
                "         </div> <span class=\"video-title title-truncate m-t-5\">五十岁阿姨说她没想到自己还能又三次高潮</span> </a> \n" +
                "        <div class=\"video-views pull-left\"> \n" +
                "         <span class=\"info\">添加时间:</span> 3 小时 前\n" +
                "         <br> \n" +
                "         <span class=\"info\">作者:</span> HHoaoHH\n" +
                "         <br> \n" +
                "         <span class=\"info\">查看:</span> 7704 \n" +
                "         <span class=\"info\">收藏:</span> 79\n" +
                "         <br>\n" +
                "         <span class=\"info\">留言:</span> 3 &nbsp;&nbsp; \n" +
                "         <img src=\"images/like.png\" height=\"10\">0&nbsp; \n" +
                "         <img src=\"images/dislike.png\" height=\"10\"> 1 \n" +
                "        </div> \n" +
                "       </div> \n" +
                "       <div class=\"well well-sm\"> \n" +
                "        <a href=\"http://91porn.com/view_video.php?viewkey=3ea83f1da64030885f5a\"> \n" +
                "         <div class=\"thumb-overlay\" id=\"playvthumb_655610\"> \n" +
                "          <img class=\"img-responsive\" src=\"https://i.91p30.com/thumb/655610.jpg\"> \n" +
                "          <div class=\"hd-text-icon\">\n" +
                "           HD\n" +
                "          </div> \n" +
                "          <span class=\"duration\">02:37</span> \n" +
                "         </div> <span class=\"video-title title-truncate m-t-5\">背着男友说和闺蜜逛街，逛到我床上了，骚情很，可以SM</span> </a> \n" +
                "        <div class=\"video-views pull-left\"> \n" +
                "         <span class=\"info\">添加时间:</span> 3 小时 前\n" +
                "         <br> \n" +
                "         <span class=\"info\">作者:</span> jian1981\n" +
                "         <br> \n" +
                "         <span class=\"info\">查看:</span> 5764 \n" +
                "         <span class=\"info\">收藏:</span> 72\n" +
                "         <br>\n" +
                "         <span class=\"info\">留言:</span> 2 &nbsp;&nbsp; \n" +
                "         <img src=\"images/like.png\" height=\"10\">1&nbsp; \n" +
                "         <img src=\"images/dislike.png\" height=\"10\"> 2 \n" +
                "        </div> \n" +
                "       </div> \n" +
                "       <div class=\"well well-sm\"> \n" +
                "        <a href=\"http://91porn.com/view_video.php?viewkey=cb5fc976b02939bd59af\"> \n" +
                "         <div class=\"thumb-overlay\" id=\"playvthumb_655601\"> \n" +
                "          <img class=\"img-responsive\" src=\"https://i.91p30.com/thumb/655601.jpg\"> \n" +
                "          <div class=\"hd-text-icon\">\n" +
                "           HD\n" +
                "          </div> \n" +
                "          <span class=\"duration\">05:21</span> \n" +
                "         </div> <span class=\"video-title title-truncate m-t-5\">调教巨乳00后大四骚母狗</span> </a> \n" +
                "        <div class=\"video-views pull-left\"> \n" +
                "         <span class=\"info\">添加时间:</span> 3 小时 前\n" +
                "         <br> \n" +
                "         <span class=\"info\">作者:</span> xnb2022\n" +
                "         <br> \n" +
                "         <span class=\"info\">查看:</span> 5220 \n" +
                "         <span class=\"info\">收藏:</span> 135\n" +
                "         <br>\n" +
                "         <span class=\"info\">留言:</span> 5 &nbsp;&nbsp; \n" +
                "         <img src=\"images/like.png\" height=\"10\">7&nbsp; \n" +
                "         <img src=\"images/dislike.png\" height=\"10\"> 2 \n" +
                "        </div> \n" +
                "       </div> \n" +
                "       <div class=\"well well-sm\"> \n" +
                "        <a href=\"http://91porn.com/view_video.php?viewkey=6cdf7b06ea305abafdb5\"> \n" +
                "         <div class=\"thumb-overlay\" id=\"playvthumb_655604\"> \n" +
                "          <img class=\"img-responsive\" src=\"https://i.91p30.com/thumb/655604.jpg\"> \n" +
                "          <div class=\"hd-text-icon\">\n" +
                "           HD\n" +
                "          </div> \n" +
                "          <span class=\"duration\">02:16</span> \n" +
                "         </div> <span class=\"video-title title-truncate m-t-5\">厦门岛内，约操良家大奶小少妇，送完孩子就过来</span> </a> \n" +
                "        <div class=\"video-views pull-left\"> \n" +
                "         <span class=\"info\">添加时间:</span> 3 小时 前\n" +
                "         <br> \n" +
                "         <span class=\"info\">作者:</span> yoyo1977\n" +
                "         <br> \n" +
                "         <span class=\"info\">查看:</span> 4545 \n" +
                "         <span class=\"info\">收藏:</span> 88\n" +
                "         <br>\n" +
                "         <span class=\"info\">留言:</span> 4 &nbsp;&nbsp; \n" +
                "         <img src=\"images/like.png\" height=\"10\">5&nbsp; \n" +
                "         <img src=\"images/dislike.png\" height=\"10\"> 0 \n" +
                "        </div> \n" +
                "       </div> \n" +
                "      </div> \n" +
                "     </div> \n" +
                "    </div>\n" +
                "   </div> \n" +
                "   <!-- end div container --> \n" +
                "   <div class=\"footer-container\" id=\"footer-container\"> \n" +
                "    <div class=\"footer-links\"> \n" +
                "     <div class=\"container\"> \n" +
                "      <div class=\"row footer-row\"> \n" +
                "       <p> 警告︰此网站只适合十八岁或以上人士观看。此网站内容可能令人反感；不可将此区的内容派发、传阅、出售、出租、交给或借予年龄未满18岁的人士或将本网站内容向该人士出示、播放或放映.如果你发现某些影片内容不合适，或者你是该影片的版权所有者而要求删除影片的，请联系我们，我们会很快做出回复。<br> <img src=\"images/desktop.png\"><a href=\"change.php?mode=d&amp;redirect=http%3A%2F%2F91porn.com%2Fview_video.php%3Fviewkey%3De6f1e55a65ca32ddee69%26page%3D%26viewtype%3D%26category%3D\">桌面版</a>&nbsp;&nbsp;<img src=\"images/mobile.png\"><a href=\"change.php?mode=m&amp;redirect=http%3A%2F%2F91porn.com%2Fview_video.php%3Fviewkey%3De6f1e55a65ca32ddee69%26page%3D%26viewtype%3D%26category%3D\">手机版</a> </p>\n" +
                "       <p> <a href=\"/\">Chinese homemade video</a> <a href=\"faq.php\">常见问题</a> | <a href=\"contact.php\">联系我们</a> | <a href=\"dmca.php\">dmca</a> | <a href=\"2257.php\">2257</a> | <a href=\"privacy.php\">隐私政策</a>| <a href=\"terms.php\">使用协议</a> </p> \n" +
                "      </div> \n" +
                "     </div> \n" +
                "    </div> \n" +
                "   </div> \n" +
                "  </div> \n" +
                "  <div align=\"center\"></div> \n" +
                "  <script type=\"text/javascript\">\n" +
                "var gaJsHost = ((\"https:\" == document.location.protocol) ? \"https://ssl.\" : \"http://www.\");\n" +
                "document.write(unescape(\"%3Cscript src='\" + gaJsHost + \"google-analytics.com/ga.js' type='text/javascript'%3E%3C/script%3E\"));\n" +
                "</script> \n" +
                "  <script type=\"text/javascript\">\n" +
                "var pageTracker = _gat._getTracker(\"UA-5740185-1\");\n" +
                "pageTracker._setSampleRate('10');\n" +
                "pageTracker._trackPageview();\n" +
                "</script> \n" +
                "  <script src=\"js/jquery.lazyload.min.js?ver=20190106\"></script> \n" +
                "  <div class=\"gotop\">\n" +
                "   <i class=\"fa fa-arrow-up\"></i> \n" +
                "  </div> \n" +
                "  <script src=\"js/stickgotoTop.js\"></script> \n" +
                "  <script type=\"text/javascript\">(function(){window['__CF$cv$params']={r:'71b028ec7df68f02',m:'Kufu7K1e5DGB.fim8UBFsSLHab4jtlZrvrGrCzLXV20-1655179235-0-AT2VGy4PP6Qiux3tlfnfj2lRvjhaMs2scOHBcW+TXkoWiJlavnV7sXH4B+jIqpBt1gQIHXycCpEFiyCHQ5ACrh7LodNxxsjVX4Yps+x5+lfFOWkHMfghbKcdKfxtNK3RtCu2Igy9u+7VTfIagx5PuVlSn02njyT5q+8OyNvPckbiJOOav6YynzYeg4iDtKSOgN7OGRIn+ZaXGBDFiDzIYAQ=',s:[0x0829503385,0x8e00458119],u:'/cdn-cgi/challenge-platform/h/g'}})();</script>  \n" +
                " </body>\n" +
                "</html>";

        String datas = getSubUtilSimple(html, "strencode\\((.*?)\\)\\)").replaceAll("\"","");
        String[] split = datas.split(",");
        String data = split[0];
        String tree = split[1];
        String text = split[2];

        String l = "";
        String result = "";
        String code = "";
        int len = 0;
        String t = "";
        int k = 0;
        String rUJzL = "0|4|3|2|6|5|1";
        String[] callbackVals = rUJzL.split("|");
        int callbackCount = 0;
        for (int x = 0; x < callbackVals.length; x++) {
            switch (callbackVals[callbackCount++]) {
                case "0":
                    l = text.substring(text.length() - 1, text.length());
                    continue;
                case "1":
                    result = atob(code);
                case "2":
                    len = tree.length();
                    continue;
                case "3":
                    data = atob(data);
                    continue;
                case "4":
                    if (dBxJx(l, 2)) {
                        t = data;
                        data = tree;
                        tree = t;
                    }
                    continue;
                case "5":
                    for (int i = 0; zfcNo(i, data.length()); i++) {
                        k = NqIoV(i, len);
                        code = code + fromCharCode(Character.codePointAt(data, i) ^ Character.codePointAt(tree, k));
                    }
                    continue;
                case "6":
                    code = "";
                    continue;
            }
        }
        System.out.println(result);
    }

    private static boolean dBxJx(String l, int x) {
        return Integer.parseInt(l) == x;
    }

    private static boolean zfcNo(int isSlidingUp, int cont) {
        return isSlidingUp < cont;
    }

    private static int NqIoV(int isSlidingUp, int cont) {
        return isSlidingUp % cont;
    }


    private static String fromCharCode(int... codePoints) {
        StringBuilder builder = new StringBuilder(codePoints.length);
        for (int codePoint : codePoints) {
            builder.append(Character.toChars(codePoint));
        }
        return builder.toString();
    }

    /**
     * // atob method
     * // 逆转encode的思路即可
     *
     * @param inStr
     * @return
     */
    private static String atob(String inStr) {
        if (inStr == null) return null;
        inStr = inStr.replaceAll("\\s|=", "");
        StringBuilder result = new StringBuilder();

        int cur;
        int prev = -1;
        int mod;
        int i = 0;


        while (i < inStr.length()) {
            cur = base64hash.indexOf(inStr.charAt(i));
            mod = i % 4;
            switch (mod) {
                case 0:
                    break;
                case 1:
                    result.append(String.valueOf((char) (prev << 2 | cur >> 4)));
                    break;
                case 2:
                    result.append(String.valueOf((char) ((prev & 0x0f) << 4 | cur >> 2)));
                    break;
                case 3:
                    result.append(String.valueOf((char) ((prev & 3) << 6 | cur)));
                    break;
            }

            prev = cur;
            i++;
        }
        return result.toString();
    }

    private static String getSubUtilSimple(String soap, String rgex1) {
        Pattern pattern = Pattern.compile(rgex1);// 匹配的模式
        Matcher m = pattern.matcher(soap);
        while (m.find()) {
            return m.group(1);
        }
        return "";
    }
}
