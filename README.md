# run-time-class
project a 和 project b 拥有相同名字的类 `com.yuanwhy.runtime.Hello`

project c 依赖 project a 的 jar 和 project b 的 jar ,  `project c` 在加载类 `com.yuanwhy.runtime.Hello` 的时候从
classpath 中搜索，先从 project a 中搜索到此类，即加载 project a 中的 `com.yuanwhy.runtime.Hello`


问：能不能让 poject c 加载 project b 中的 `com.yuanwhy.runtime.Hello`, 或者两个类同时加载？
