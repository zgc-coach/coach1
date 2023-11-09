// alert(window.location.href)
function GetQueryString(name) {
    var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)");
    var r = decodeURI(window.location.search.substr(1)).match(reg);
    if (r != null) return unescape(r[2]);
    return null;
}
var userid;
var sname = GetQueryString("userid");
if (sname != null) {
    // var sname_ = decodeURIComponent(sname);
    userid = decodeURIComponent(sname);

}
console.log (userid)
window.addEventListener('load',function(){
    const id=document.getElementById('id');
    id.value=userid;
})