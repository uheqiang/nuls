webpackJsonp([28],{TcIh:function(e,t){},bipM:function(e,t,s){"use strict";Object.defineProperty(t,"__esModule",{value:!0});var n={data:function(){return{percentageShow:!1,percentageNumber:0,executionNumber:0,toUpdatedInterval:null,percentageInterval:null,percentageTwoInterval:null,updatedOver:!1,clientVersionData:[]}},components:{Back:s("LPk9").a},created:function(){var e=this;this.percentageInterval=setInterval(function(){100===e.percentageNumber&&(clearInterval(e.toUpdatedInterval),e.updatedOver=!0,e.percentageNumber=0,sessionStorage.setItem("percentageNumber",e.percentageNumber.toString()),clearInterval(e.percentageInterval))},500),this.clientVersion()},mounted:function(){var e=this;setTimeout(function(){parseInt(sessionStorage.getItem("percentageNumber"))>0&&(e.percentageShow=!0,e.percentageTwoInterval=setInterval(function(){e.clientUpgrade()},500))},100)},destroyed:function(){clearInterval(this.toUpdatedInterval),clearInterval(this.percentageInterval),clearInterval(this.percentageTwoInterval)},methods:{clientVersion:function(){var e=this;this.$fetch("/client/version").then(function(t){console.log(t),t.success&&(t.data.infromation=t.data.infromation.replace(/[\n\r]/g,"<br>"),e.clientVersionData=t.data)})},toUpdated:function(){var e=this;this.$post("/client/upgrade/"+this.clientVersionData.newestVersion).then(function(t){t.success?(e.percentageShow=!0,e.toUpdatedInterval=setInterval(function(){e.clientUpgrade(),sessionStorage.setItem("percentageNumber",e.percentageNumber.toString())},500)):e.$message({type:"warning",message:e.$t("message.passWordFailed")+t.msg})})},clientUpgrade:function(){var e=this;this.$fetch("/client/upgrade").then(function(t){t.success?e.executionNumber<10?(e.percentageNumber=t.data.percentage,0===t.data.percentage?e.executionNumber=e.executionNumber+1:e.executionNumber=0):(e.$message({type:"warning",message:e.$t("message.c195")}),e.percentageShow=!1,e.percentageNumber=0):(e.percentageShow=!1,e.$message({type:"warning",message:e.$t("message.passWordFailed")+t.msg}),e.percentageNumber=0)})},suspend:function(){var e=this;this.$confirm(this.$t("message.c179"),this.$t("message.c86"),{confirmButtonText:this.$t("message.confirmButtonText"),cancelButtonText:this.$t("message.cancelButtonText"),center:!0}).then(function(){e.executionNumber=0,e.$post("/client/upgrade/stop").then(function(t){t.success?(clearInterval(e.homeSetInterval),e.percentageNumber=0,e.percentageShow=!1,e.$message({type:"success",message:e.$t("message.passWordSuccess")})):e.$message({type:"warning",message:e.$t("message.passWordFailed")+t.msg})})}).catch(function(){e.$message({type:"info",message:e.$t("message.c59")})})},outRestart:function(){var e=this;this.$post("/client/restart").then(function(t){t.success?(e.$message({type:"success",message:e.$t("message.passWordSuccess")}),e.closeBrowser()):e.$message({type:"warning",message:e.$t("message.passWordFailed")+t.msg})})},closeBrowser:function(){navigator.userAgent.indexOf("MSIE")>0?navigator.userAgent.indexOf("MSIE 6.0")>0?(window.opener=null,window.close()):(window.open("","_top"),window.top.close()):navigator.userAgent.indexOf("Firefox")>0?window.location.href="about:blank ":(window.location.href="about:blank",window.opener=null,window.open("","_self",""),window.close(),console.log("guangg"))}}},a={render:function(){var e=this,t=e.$createElement,s=e._self._c||t;return s("div",{staticClass:"updated-version"},[s("Back",{attrs:{backTitle:this.$t("message.setManagement")}}),e._v(" "),s("div",{directives:[{name:"show",rawName:"v-show",value:!e.updatedOver,expression:"!updatedOver"}],staticClass:"updated-info"},[s("h1",[e._v(e._s(this.$t("message.c175")))]),e._v(" "),s("p",[e._v(e._s(this.$t("message.purseVersion"))+":V"+e._s(this.clientVersionData.newestVersion))]),e._v(" "),s("h3",{domProps:{innerHTML:e._s(this.clientVersionData.infromation)}}),e._v(" "),s("div",{directives:[{name:"show",rawName:"v-show",value:!this.percentageShow,expression:"!this.percentageShow"}],staticClass:"updated-info-bt"},[s("el-button",{attrs:{type:"primary"},on:{click:e.toUpdated}},[e._v(e._s(this.$t("message.c176")))])],1),e._v(" "),s("div",{directives:[{name:"show",rawName:"v-show",value:this.percentageShow,expression:"this.percentageShow"}],staticClass:"updated-info-per"},[s("el-progress",{attrs:{"text-inside":!0,"stroke-width":16,percentage:this.percentageNumber,color:"#67c23a"}}),e._v(" "),s("i",{staticClass:"el-icon-close cursor-p",on:{click:e.suspend}})],1)]),e._v(" "),s("div",{directives:[{name:"show",rawName:"v-show",value:e.updatedOver,expression:"updatedOver"}],staticClass:"updated-info-over"},[s("h1",[e._v(e._s(this.$t("message.c175")))]),e._v(" "),s("p",[e._v(e._s(this.clientVersionData.newestVersion))]),e._v(" "),s("p",[e._v(e._s(this.$t("message.c177")))]),e._v(" "),s("div",{staticClass:"updated-info-bt"},[s("el-button",{attrs:{type:"primary",id:"closeBt"},on:{click:e.outRestart}},[e._v(e._s(this.$t("message.c178")))])],1)])],1)},staticRenderFns:[]};var r=s("vSla")(n,a,!1,function(e){s("TcIh")},null,null);t.default=r.exports}});