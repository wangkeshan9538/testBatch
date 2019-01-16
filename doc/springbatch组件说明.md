##主要组件
* jobRepositry
  
  Job Repository 来存储 Job 执行期的元数据（这里的元数据是指 Job Instance、Job Execution、Job Parameters、Step Execution、Execution Context 等数据）
  
* JobLauncher
    
    
* job

    Job Instance（作业实例）是一个运行期的概念，Job 每执行一次都会涉及到一个 Job Instance。

* step

    job 的步骤
    
* itemRead process writer
    
    
* jobParameters

    Job执行的参数
* Execution

    Job Execution 表示 Job 执行的句柄 ，每次执行都会有一个
* tasklet
    
    继承了step, 可以认为batch提供了两种处理方式,一中是tasklet, 直接对所有数据处理,一种是chunk,对一批数据分块执行.
    https://www.baeldung.com/spring-batch-tasklet-chunk
    
## 问题
   * 提交的间隔，与事务 ，和数据库的事务有关吗 ，
   * 如何保证错误的跟踪
   * 并发处理
   * 怎样获得所有的元数据
   
    看起来可以通过 jobExplore 和 jobOperator 来实现
```angular2html
一个健壮的Job通常需要具备如下的几个特性：
1. 容错性在Job执行期间非致命的异常，Job执行框架应能够进行有效的容错处理，而不是让整个Job执行失败；
通常只有致命的、导致业务不正确的异常才可以终止Job的执行。
2. 可追踪性Job执行期间任何发生错误的地方都需要进行有效的记录，方便后期对错误点进行有效的处理。
例如在Job执行期间任何被忽略处理的记录行需要被有效的记录下来，应用程序维护人员可以针对被忽略的记录后续做有效的处理。
3. 可重启性Job执行期间如果因为异常导致失败，应该能够在失败的点重新启动Job；而不是从头开始重新执行Job。
```
   
然鹅我并没有看到springbatch可以从错误的地方重启，