/**
 * 杨易达
 * @email: y51288033@outlook.com
 *         y51288033@gmail.com
 */
import Vue, { h } from 'vue'
import App from './App'
import router from './router'
import httpRquest from './utils/httpRequest'
 
import ElementUI from 'element-ui';
import 'element-ui/lib/theme-chalk/index.css';

Vue.use(ElementUI);
//全局挂载
Vue.config.productionTip = false
Vue.prototype.$http = httpRquest

/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  components: { App },
  template: '<App/>'
})
