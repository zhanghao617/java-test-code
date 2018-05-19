<template>
    <div id="home">
        <el-button type="primary" @click="addMovie">添加电影</el-button>

        <el-table :data="movies" style="width: 100%">
             <el-table-column
            type="selection"
            width="55">
            </el-table-column>
            <el-table-column
                prop="name"
                label="电影名称">
            </el-table-column>
            <el-table-column
                prop="direct"
                label="导演"
                width="60">
            </el-table-column>
            <el-table-column
                prop="createTimeYear"
                label="上映时间"
                width="150">
            </el-table-column>
            <el-table-column
                prop="releaseTime"
                label="发布时间"
                width="150">
            </el-table-column>
            <el-table-column
                prop="doc"
                label="简介">
            </el-table-column>
        </el-table>

    </div>
</template>
<script>
//导入请求路径的配置文件
import api from "../const/url.js"

export default {
  name: "Home",
  data() {
    return {
      movies: []
    };
  },
  methods: {
      addMovie:function() {
          this.$router.push('/new')
      }
  },
  //钩子函数
  mounted:function () {
      var url = api.MovieHome;
      this.$http.get(url).then(response => {
          this.movies=response.data.result;
      }).catch(error => {
          this.$message.error('系统提示：' + error.message);
      });
  }
};
</script>

<style>
    
</style>
