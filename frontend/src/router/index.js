import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '../views/Home.vue'
import Signup from '../views/Signup.vue'
import Login from '../views/Login.vue'
import NewsfeedPersonal from '../views/NewsFeed/NewsfeedPersonal.vue'
import NewsfeedDetail from '../views/NewsFeed/NewsfeedDetail.vue'
import NewsfeedForm from '../views/NewsFeed/NewsfeedForm.vue'
import MyPage from '../views/MyPage.vue'
import Search from '../views/Search.vue'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'Home',
    component: Home
  },
  {
    path: '/signup',
    name: 'Signup',
    component: Signup
  },
  {
    path: '/login',
    name: 'Login',
    component: Login
  },
  {
    path: '/mypage',
    name: 'MyPage',
    component: MyPage
  },
  {
    path: '/newsfeed-personal',
    name: 'NewsfeedPersonal',
    component: NewsfeedPersonal
  },
  {
    path: '/newsfeed-detail',
    name: 'NewsfeedDetail',
    component: NewsfeedDetail
  },
  {
    path: '/newsfeed-form',
    name: 'NewsfeedForm',
    component: NewsfeedForm
  },
  {
    path: '/search',
    name: 'Search',
    component: Search
  },
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
