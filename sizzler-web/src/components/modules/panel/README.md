## 面板相关（components/modules/panel/*）

* 面板添加(panel-add)
* 面板复制(panel-copy)
* 面板编辑(panel-edit)
* 面板列表(panel-list)
* 面板分享(panel-share)
* 面板模版(panel-template)





---





### 面板添加（panel-add）

**主要功能**

* 面板名称默认值生成
  * 名称默认值尾缀数字自增显示
* 面板创建
  * 生成loading
  * 面板位置版本号校验
    1. 如当前面板位置版本号与后台不一致，则用后台数据更新。
    2. 创建面板
  * 创建面板成功后
    1. 退出前弹窗提示
    2. 选中当前新增面板，并进入编辑模式
    3. 更新前端面板列表信息
    4. 清除loading
    5. 更新面板位置信息
  * 创建失败后
    1. 面板列表使用后台数据覆盖，并更新面板列表位置信息及版本号
    2. 清除loading
* 面板模版入口
* 取消及关闭面板





**表单校验**

* 面板名称
  - 必填、最大长度50
  - 失去焦点，进行非空判断，如果为空，则用默认值自动填充
  - 回车事件，触发保存事件





---





### 面板复制(panel-copy)

**主要功能**

- 面板名称默认值生成
  - 名称默认值尾缀数字自增显示
- 复制保存
  - 生成loading
  - 面板位置版本号校验
    1. 如当前面板位置版本号与后台不一致，则用后台数据更新
    2. 获取widget列表
  - 获取widget列表成功后
    1. 面板创建
  - 面板创建成功后
    1. 更新面板位置信息
    2. 保存widget列表
    3. 更新前端面板列表信息
  - 保存widget列表成功后
    1. 退出前弹窗提示
    2. 选中当前新增面板，并进入编辑模式
    3. 清除loading
    4. 更新面板位置信息
- 取消及关闭面板



**表单校验**

- 面板名称
  - 必填、最大长度50
  - 回车事件，触发保存事件




**备注**

* 可优化：在失去焦点时，同面板添加时统一交互，增加为空判断
* 可优化：保存widget列表由现有的逐个添加改为后端统一添加





------





### 面板编辑(panel-edit)

**主要功能**

- 编辑保存
  - 生成loading
  - 面板位置版本号校验
    1. 如当前面板位置版本号与后台不一致，则用后台数据更新
    2. 面板编辑信息更新
  - 面板编辑信息更新成功后
    1. 更新前端面板信息
    2. 清除loading
    3. 更新面板位置信息
- 取消及关闭面板



**表单校验**

- 面板名称
  - 必填、最大长度50
  - 回车事件，触发保存事件

**备注**

- 可优化：在失去焦点时，同面板添加时统一交互，增加为空判断





------





### 面板列表(panel-list)

**主要功能**

* 文件夹
  * 创建
  * 重命名
  * 删除
  * 以上操作成功后
    1. 前端面板列表信息更新
    2. 面板位置更新
* 拖拽
  * 面板位置版本号校验
    1. 如当前面板位置版本号与后台不一致，则用后台数据更新
    2. 面板位置更新
* 面板删除
  - 生成loading
  - 面板位置版本号校验
    1. 如当前面板位置版本号与后台不一致，则用后台数据更新。
    2. 删除面板
  - 删除面板成功后
    1. 更新面板位置信息
    2. 保存widget列表
    3. 更新前端面板列表信息
    4. 更新面板位置信息
    5. 清除loading



**表单校验**

* 文件夹名称
  * 必填、最大长度50
  * 失去焦点进行非空判断，如果为空，则用默认名称填充



**备注**

- 可优化：可以增加搜索功能
- 可优化：将面板删除模块提出单独管理





------





### 面板分享(panel-share)

**主要功能**

* 分享开关状态更新
  * 操作成功后
    1. 更新分享链接地址的查看状态
    2. 更新前端面板信息
* 关闭面板
* 分享链接地址点击全选



**备注**

- 可优化：分享链接地址点击自动复制





------





### 面板模版(panel-template)

**主要功能**

* 面板模版列表获取
  * 操作成功后
    1. 前端模版列表更新并按字段(orderNumber)排序且展示
    2. 前端模版标签(tag)列表更新并展示
* 模版标签(tag)过滤筛选
  * 标签(tag)列表根据所选操作进行过滤显示
  * 模版列表根据所选操作进行过滤显示
  * 如没有相符的模版，则出无数据提示
* 单个模版添加
  * 生成loading
  * 面板位置版本号校验
    1. 如果面板位置版本号与后端数据不一致，则按后端数据更新
  * 新增成功后
    1. 前端面板位置列表更新
    2. 更新面板位置信息
    3. 选中当前新增面板
    4. 进入编辑模式
  * 删除loading
* 模版预览图(放大/缩放)查看



**备注**

- 可优化：后期若模版列表数量有所增加时，可考虑采用模版列表滚屏加载方式。