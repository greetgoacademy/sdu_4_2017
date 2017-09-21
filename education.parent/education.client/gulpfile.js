'use strict';

const gulp = require('gulp');
const ser = gulp.series;
const par = gulp.parallel;
const task = gulp.task;
const del = require('del');
const less = require('gulp-less');
const path = require('path');
const pug = require('gulp-pug');
const browserSync = require('browser-sync').create();

let isWatch = false;

function outDir() {
    return path.resolve(__dirname, 'build', 'public');
}

task('clean', function () {
    return del(['build']);
});

task('less', function () {
    return gulp.src("front/less/*.less").pipe(less()).pipe(gulp.dest(outDir()));
});

task('pug', function () {
    return gulp.src("front/pug/index.pug").pipe(pug({pretty: true})).on("error", console.log)
        .pipe(gulp.dest(outDir()));
});

task('copy', function () {
    return gulp.src("front/pug/index.pug").pipe(pug({pretty: true})).on("error", console.log)
        .pipe(gulp.dest(outDir()));
});

task('assets', ser('less', 'pug'));

task('server', function (back) {
    browserSync.init({server: path.resolve('build', 'public')});

    browserSync.watch('build/public/**/*.*').on('change', browserSync.reload);

    back();
});

task('start', ser(
    'clean', 'assets', 'server',
    function () {
        gulp.watch('front/pug/**/*.pug', ser('pug'));
        gulp.watch('front/less/**/*.less', ser('less'));
    }
));


