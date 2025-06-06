const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmes9r9/",
            name: "ssmes9r9",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmes9r9/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "停车场管微信小程序"
        } 
    }
}
export default base
