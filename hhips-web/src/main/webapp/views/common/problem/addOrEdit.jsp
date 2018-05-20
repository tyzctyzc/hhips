<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/global.jsp"%>
<%@ include file="/common/include_common.jsp"%>
<html lang="zh-cn">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>资源添加修改页</title>
<style>
    .preview_box img {
        width: 400px;
    }
    .active {
        box-shadow: 0px 0px 10px 10px rgba(0,0,255,.4);
    }
</style>
</head>
<body>
	<form id="dataForm" method="post">
		<div id="toolbar" align="left" style="background: #F5F5F5;">
			<button id="save-btn" class="waves-effect btn btn-success btn-sm"
				style="margin-left: 10px;" type="button" href="javascript:;">
				<i class="zmdi zmdi-save"></i> 保存
			</button>
		</div>

        <h1 style="margin-left: 10px;">${chaptername}</h1>
		<div class="container col-xs-11"
			style="margin-top: 30px; margin-left: 50px; display: table;">

			<div id="noSelDiv" style="display: none;" class="row">
				<div class="col-xs-11">
					<div class="alert alert-danger alert-dismissible" role="alert">
						<strong>警告！</strong> 请选择左侧菜单节点再进行操作。
					</div>
				</div>
			</div>

			<div class="row" style="display: none;">
				<div class="col-xs-7">
                    <input type="hidden" id="problemchapterid" name="problemchapterid"
                        value="${chapterid}" class="form-control" />
				</div>
			</div>

			<div class="row" style="margin-top: 10px; margin-bottom: 10px;">
				<div class="col-xs-4 text-left"
					style="background-color: #FFEEDD; line-height: 26px; vertical-align: middle;">
					<label style="margin-top: 5px; font-size: 14px; color: grey;">问题模块：</label>
				</div>
				<div class="col-xs-7">
                    <select id="moduleselect" name="moduleselect" class="selectpicker">
                        <c:forEach items="${modules }" var="item">
                             <option value=${item.idmodule}>${item.modulename}</option>
                        </c:forEach>
                    </select>
				</div>
			</div>
			<div class="row" style="margin-top: 10px; margin-bottom: 10px;">
				<div class="col-xs-4 text-left"
					style="background-color: #FFEEDD; line-height: 26px; vertical-align: middle;">
					<label style="margin-top: 5px; font-size: 14px; color: grey;">问题难度：</label>
				</div>
				<div class="col-xs-7">
					<select id="problemlevel" name="problemlevel" class="selectpicker">
						<option value=1>1</option>
						<option value=2>2</option>
						<option value=3 selected = "selected">3</option>
						<option value=4>4</option>
					</select>
				</div>
			</div>
			<div class="row" style="margin-top: 10px; margin-bottom: 10px;">
				<div class="col-xs-4 text-left"
					style="background-color: #FFEEDD; line-height: 26px; vertical-align: middle;">
					<label style="margin-top: 5px; font-size: 14px; color: grey;">问题索引：</label>
				</div>
				<div class="col-xs-7">
					<select id="problemindex" name="problemindex" class="selectpicker">
						<option value="L1">L1</option>
						<option value="L2">L2</option>
						<option value="L2L">L2L</option>
						<option value="L3">L3</option>
						<option value="L4">L4</option>
						<option value="L4L">L4L</option>
						<option value="L5">L5</option>
						<option value="L5L">L5L</option>
						<option value="L6">L6</option>
						<option value="L7">L7</option>
						<option value="L8">L8</option>
						<option value="01">01</option>
						<option value="02">02</option>
						<option value="03">03</option>
						<option value="04">04</option>
						<option value="05">05</option>
						<option value="06">06</option>
						<option value="07">07</option>
						<option value="08">08</option>
						<option value="09">09</option>
						<option value="10">10</option>
						<option value="11">11</option>
						<option value="12">12</option>
						<option value="13">13</option>
						<option value="14">14</option>
						<option value="15">15</option>
						<option value="16">16</option>
						<option value="17">17</option>
						<option value="Z01">Z01</option>
						<option value="Z02">Z02</option>
						<option value="Z03">Z03</option>
						<option value="Z04">Z04</option>
						<option value="Z05">Z05</option>
						<option value="Z06">Z06</option>
						<option value="Z07">Z07</option>
						<option value="Z08">Z08</option>
						<option value="Z09">Z09</option>
						<option value="Z10">Z10</option>
					</select>
				</div>
			</div>
			<div class="row" style="margin-top: 10px; margin-bottom: 10px;">
				<div class="col-xs-4 text-left"
					style="background-color: #FFEEDD; line-height: 26px; vertical-align: middle;">
					<label style="margin-top: 5px; font-size: 14px; color: grey;">问题答案：</label>
				</div>
				<div class="col-xs-7">
					<div class="form-group">
						<input type="text" id="problemanswerstring" name="problemanswerstring"
							value="${problem.problemanswerstring}" class="form-control"
							placeholder="请输入答案" />
					</div>
				</div>
			</div>
			<div class="row" style="margin-top: 10px; margin-bottom: 10px;">
				<div class="col-xs-4 text-left"
					style="background-color: #FFEEDD; line-height: 26px; vertical-align: middle;">
					<label id="problemDetail" name="problemDetail"
					    style="margin-top: 5px; font-size: 14px; color: grey;">问题/答案详细：</label>
				</div>
				<div class="col-xs-7">
					<div class="form-group">
						<input id="base64" type="text" class="form-control"
							placeholder="请输入问题/答案详细" />
					</div>
				</div>
			</div>
			<div class="row" style="margin-top: 10px; margin-bottom: 10px;">
				<div class="col-xs-7">
					<label id="problemlabel" class="active" for="img_input" onclick="toggleImage(1)"
					     style="margin-top: 5px; font-size: 14px; color: grey;">problem</label>
					<label id="answerabel" for="img_input" onclick="toggleImage(2)"
					     style="margin-top: 5px; font-size: 14px; color: grey;">answer</label>
					<div class="preview_box" id="problemview"></div>
					<div class="preview_box" id="answerview"></div>
				</div>
			</div>
		</div>
	</form>
</body>
<script type="text/javascript">
    var activeImage=1;
    function toggleImage(mode) {
        if (mode==1) {
            activeImage = 1;
            $( "#problemlabel" ).addClass("active");
            $( "#answerabel" ).removeClass("active");
        }
        else {
            activeImage = 2;
            $( "#answerabel" ).addClass("active");
            $( "#problemlabel" ).removeClass("active");
        }
    }

    var imgProblemString;
    var imgAnswerString;
	$(function() {
		// 表单效验
		$('form').bootstrapValidator({
			//container : "tooltip",
			container : "popover",
			message : 'This value is not valid',
			feedbackIcons : {
				valid : 'glyphicon glyphicon-ok',
				invalid : 'glyphicon glyphicon-remove',
				validating : 'glyphicon glyphicon-refresh'
			},
			fields : {
				'menuName' : {
					validators : {
						notEmpty : {
							message : '菜单名称不能为空'
						},
						stringLength : {
							min : 1,
							max : 36
						},
					}
				},
				'menuDescribe' : {
					validators : {
						stringLength : {
							min : 1,
							max : 100
						},
					}
				},
				'menuUrl' : {
					validators : {
						stringLength : {
							min : 1,
							max : 100
						},
						regexp : {
							regexp : /^[a-zA-Z0-9_/\.]+$/,
							message : '请输入正确的url地址'
						}
					}
				},
				'menuIndex' : {
					validators : {
						integer : {
							message : '请输入整数类型'
						}
					}
				}
			}
		});

		// 保存提交
		$('#save-btn').click(function() {
			//进行表单验证
			var bv = $('#dataForm').data('bootstrapValidator');
			bv.validate();
			if (bv.isValid()) {
				// 获取form表单中的值
                var formData = {};
                console.log("imgProblemString", imgProblemString);
                console.log("imgAnswerString", imgAnswerString);
                formData.problemlevel = $( "#problemlevel" ).val();
                if(typeof imgProblemString != 'undefined' && imgProblemString) {
                    formData.problemdetail = imgProblemString.substr(22);
                }
                if(typeof imgAnswerString != 'undefined' && imgAnswerString) {
                   formData.problemanswerdetail = imgAnswerString.substr(22);
                }
                formData.problemchapterid = $( "#problemchapterid" ).val();
                formData.problemindex=$( "#problemindex" ).val();
                formData.problemmodule=$( "#moduleselect" ).val();
                formData.problemanswerstring=$( "#problemanswerstring" ).val();
                console.log("url", '${pageContext.request.contextPath}/common/problem/save');
                console.log("problem", formData);
				$.post('${pageContext.request.contextPath}/common/problem/save', formData, function(data) {
//					if('0' == data.status){
//						parent.menuNodeRefresh();//调用父页面 tree 节点刷新方法
//						resetForm();
//					}else{
//						parent.menuParentNodeRefresh();//调用父页面 tree 父节点刷新方法
//					}
					$.alert(data.msg);
				});
			}
		});
		
		// 重置表单
		function resetForm(){
			// 清空 form 表单值
			$('#menuId').val('');
			$('#menuPid').val('');
			$('#menuName').val('');
			$('#menuDescribe').val('');
			$('#menuUrl').val('');
			$('#menuIndex').val('');
			$('#menuLevel').val('');
			$('#menuIcon').val('');
			$('#menuValid').selectpicker('val', 'true');
			
			// 验证销毁
		    $("#dataForm").data('bootstrapValidator').destroy();
		    $('#dataForm').data('bootstrapValidator', null);
		    
		    // 警告提示框
			$('#noSelDiv').show();
		}
	});

    $("#img_input").on("change", function(e){

      var file = e.target.files[0]; //获取图片资源

      if (!file.type.match('image.*')) {
        return false;
      }

      var reader = new FileReader();

      reader.readAsDataURL(file); // 读取文件

      // 渲染文件
      reader.onload = function(arg) {

        if (activeImage == 1) {
            imgProblemString = arg.target.result;
            var img = '<img class="preview" src="' + arg.target.result + '" alt="preview"/>';
            //console.log(img);
            $("#problemview").empty().append(img);
        }
        else {
            imgAnswerString = arg.target.result;
            var img = '<img class="preview" src="' + arg.target.result + '" alt="preview"/>';
            //console.log(img);
            $("#answerview").empty().append(img);
        }
      }
    });

    (function($) {
      var defaults;
      $.event.fix = (function(originalFix) {
        return function(event) {
          event = originalFix.apply(this, arguments);
          if (event.type.indexOf('copy') === 0 || event.type.indexOf('paste') === 0) {
            event.clipboardData = event.originalEvent.clipboardData;
          }
          return event;
        };
      })($.event.fix);
      defaults = {
        callback: $.noop,
        matchType: /image.*/
      };
      return $.fn.pasteImageReader = function(options) {
        if (typeof options === "function") {
          options = {
            callback: options
          };
        }
        options = $.extend({}, defaults, options);
        return this.each(function() {
          var $this, element;
          element = this;
          $this = $(this);
          return $this.bind('paste', function(event) {
            var clipboardData, found;
            found = false;
            clipboardData = event.clipboardData;
            return Array.prototype.forEach.call(clipboardData.types, function(type, i) {
              var file, reader;
              if (found) {
                return;
              }
              if (type.match(options.matchType) || clipboardData.items[i].type.match(options.matchType)) {
                file = clipboardData.items[i].getAsFile();
                reader = new FileReader();
                reader.onload = function(evt) {
                  return options.callback.call(element, {
                    dataURL: evt.target.result,
                    event: evt,
                    file: file,
                    name: file.name
                  });
                };
                reader.readAsDataURL(file);
                reader.onload = function(arg) {

                    if (activeImage == 1) {
                        imgProblemString = arg.target.result;
                        var img = '<img class="preview" src="' + arg.target.result + '" alt="preview"/>';
                        //console.log(img);
                        $("#problemview").empty().append(img);
                    }
                    else {
                        imgAnswerString = arg.target.result;
                        var img = '<img class="preview" src="' + arg.target.result + '" alt="preview"/>';
                        //console.log(img);
                        $("#answerview").empty().append(img);
                    }


                  }
                return found = true;
              }
            });
          });
        });
      };
    })(jQuery);



    $("html").pasteImageReader(function(results) {
      var dataURL, filename;
      filename = results.filename, dataURL = results.dataURL;
      $data.text(dataURL);
      $size.val(results.file.size);
      $type.val(results.file.type);
      $test.attr('href', dataURL);
      var img = document.createElement('img');
      img.src= dataURL;
      var w = img.width;
      var h = img.height;
      $width.val(w)
      $height.val(h);
      return $(".active").css({
        backgroundImage: "url(" + dataURL + ")"
      }).data({'width':w, 'height':h});
    });

    var $data, $size, $type, $test, $width, $height;
    $(function() {
      $data = $('.data');
      $size = $('.size');
      $type = $('.type');
      $test = $('#test');
      $width = $('#width');
      $height = $('#height');
      $('.target').on('click', function() {
        var $this = $(this);
        var bi = $this.css('background-image');
        if (bi!='none') {
            $data.text(bi.substr(4,bi.length-6));
        }


        $('.active').removeClass('active');
        $this.addClass('active');

        $this.toggleClass('contain');

        $width.val($this.data('width'));
        $height.val($this.data('height'));
        if ($this.hasClass('contain')) {
          $this.css({'width':$this.data('width'), 'height':$this.data('height'), 'z-index':'10'})
        } else {
          $this.css({'width':'', 'height':'', 'z-index':''})
        }

      })
    })


    function copy(text) {
        var t = document.getElementById('base64')
        t.select()
        try {
            var successful = document.execCommand('copy')
            var msg = successful ? 'successfully' : 'unsuccessfully'
            alert('Base64 data coppied ' + msg+' to clipboard')
        } catch (err) {
            alert('Unable to copy text')
        }
    }
</script>
</html>