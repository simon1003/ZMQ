# ZMQ 分享
## 模式的应用和扩展

---

# 简单回顾上次内容
### 1、可伸缩的分布式或者高并发的异步网络消息库
### 2、是一套高效的socket library，是对BSD socket进行的上层封装
### 3、node与node之间存在多条数据链接，即N： M的消息传输链接

---

# ZMQ的三中基本模式
## 1、Request-Reply
## 2、Publisher-Subscriber
## 3、Parallel Pipeline

---

# 扩展模式
## 1、一个代理 Publisher，作为一个内网的 Subscriber 接受信息，同时将信息，转发到外网
## 2、一个 Client 连接多个 Server 
## 3、多个服务器模式
