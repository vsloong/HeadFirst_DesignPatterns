# 观察者模式

让你的对象知悉现状

## 认识观察者模式
1. 报社的业务是出版报纸
2. 向某家报社订阅报纸，只要他们有新版报纸出版就会给你送来
3. 当你不想看报时候取消订阅，那么他们就不再给你送报

## 出版者+订阅者=观察者模式

出版者改称为“主题（Subject）”，订阅者改称为“观察者（Observer）”

主题对象管理某些数据，当主题内数据改变就会通知观察者，前提是这个观察者订阅（注册）了这个主题

## 定义观察者模式

观察者模式定义了对象之间的一对多依赖，这样一来，当一个对象改变状态时，他的所有依赖着都会收到通知并自动更新

## 松耦合的威力

当两个对象之间松耦合，他们依然可以交互，但是不太清楚彼此的细节。

观察者模式提供了一种对象设计，让主题和观察者之间松耦合。

### 设计原则：为了交互对象之间的松耦合设计而努力

 