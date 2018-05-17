<template>
import func from './vue-temp/vue-editor-bridge';
    <div id="home">
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
                label="导演">
            </el-table-column>
            <el-table-column
                prop="createTimeYear"
                label="上映时间">
            </el-table-column>
            <el-table-column
                prop="releaseTime"
                label="发布时间">
            </el-table-column>
            <el-table-column
                prop="doc"
                label="简介">
            </el-table-column>
        </el-table>

    </div>
</template>
<script>
export default {
  name: "Home",
  data() {
    return {
      movies: []
    };
  },
  methods: {},
  //钩子函数
  mounted:function () {
      var url = 'http://localhost:8082';
      this.$http.get(url).then(response => {

      }).cache(error => {
          
      });
  }
};
</script>

<style>
</style>
