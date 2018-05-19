<template>
    <div id="addMovie">
      <el-button type="primary" @click="backList">返回列表</el-button>
      
      <el-form style="margin-top:20px" ref="form" :model="movies" label-width="80px">
        <el-form-item label="电影名称">
          <el-input v-model="movies.name"></el-input>
        </el-form-item>
         <el-form-item label="导演">
          <el-input v-model="movies.direct"></el-input>
        </el-form-item>
         <el-form-item label="上映时间">
          <el-input v-model="movies.createTimeYear"></el-input>
        </el-form-item>
        <el-form-item label="发行时间">
          <el-input v-model="movies.releaseTime"></el-input>
        </el-form-item>
         <el-form-item label="简介">
          <el-input v-model="movies.doc"></el-input>
        </el-form-item>
      
        <el-form-item>
          <el-button type="primary" @click="onSubmit">确定</el-button>  
        </el-form-item>
      </el-form>



    </div>
</template>

<script>
import api from "../const/url.js"

export default {
  name: 'addMovie',
  data(){
    return {
      movies:{

      }
    }
  },
  methods:{
    backList: function(){
      this.$router.push("/")
    },
    onSubmit: function(){
        this.$http.post(api.addMovie,this.movies).then(response => {

        }).catch(error => {
            this.$massage.error("系统提示：" + error.massage);
        });
    }
  },
  mounted(){}
}
</script>
<style>
    
</style>