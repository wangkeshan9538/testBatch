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


## 问题
   提交的间隔，与事务 ，和数据库的事务有关吗 ，