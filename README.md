作为Vim粉丝一枚，一直在寻找一款好用的Markdown预览插件，功能要简单，能在书写之余偶尔撇一下效果即可，毕竟Markdown语法都烂熟于心了。先是偶然看到了Chrome一款插件[Markdown Viewer](https://chrome.google.com/webstore/detail/markdown-viewer/ckkdlimhmcjmikdlpkmbgfkaikojcbjk)，风格非常喜欢，遗憾的是不能与Vim同步，后来又发现一款Vim插件[markdown-preview.vim](https://github.com/iamcco/markdown-preview.vim)，但是我装了好几次，在我的机器上老是报错。故事本来到此就结束了，但是程序猿乞肯如此轻易屈服，程序猿要让这天，再遮不住眼，要这地，再埋不了心，程序猿要用自己的双手开天辟地！经过程序猿在键盘上一顿猛干，[markdown-preview-sync](https://github.com/pingao777/markdown-preview-sync)横空出世了！好了，就吹到这吧。

下面简单介绍下这款插件：

### 特性

- 代码高亮
- MathJax
- 自定义CSS

### 安装准备

- Jre8及以上
- Python的[py4j](https://www.py4j.org/)库

### 安装方式

如果你使用[pathogen](https://github.com/tpope/vim-pathogen)，可以运行如下命令：

```git
cd your-path-to-bundle
git clone git@github.com:pingao777/markdown-preview-sync.git
```

如果你没有使用任何插件管理工具，直接将/autoload和/plugin目录中的文件分别放在Vim的/autoload和/plugin目录即可。

注：/src目录是项目源代码，如果不关注直接删掉就可以了。

### 设置

```vim
" Chrome和Firefox都可以，推荐使用Chrome
" 可以这样设置Chrome路径
let g:markdown_preview_sync_chrome_path = ""

" 设置Firefox浏览器路径
let g:markdown_preview_sync_firefox_path = ""

" (Optional)设置自定义CSS主题，将你的CSS文件放在autoload/java/webapp/css文件夹下，
" 以“主题名-theme.css”方式命名，然后设置如下变量
let g:markdown_preview_sync_theme = "主题名"

" 配置快捷键
autocmd filetype markdown nnoremap <F9> :MarkSyncPreview<cr>
autocmd filetype markdown nnoremap <S-F9> :MarkSyncClose<cr>
```

最后，欢迎大家多多提意见和建议。

---

### Feature

- Code Highlight
- MathJax
- Custom CSS

### Prerequisite

- Jre8 or 
- Python [py4j](https://www.py4j.org/) lib

### Installation

If you use [pathogen](https://github.com/tpope/vim-pathogen), do this:

```git
cd your-path-to-bundle
git clone git@github.com:pingao777/markdown-preview-sync.git
```

If you don't use any plugin manager, just copy files in /autoload and /plugin to Vim's /autoload and /plugin directory.

Note: /src directory is source code, you can simply delete it if you don't need it.

### Setting

```vim
" Both Chrome and Firefox is good, but Chrome is prefer
" Set Chrome path
let g:markdown_preview_sync_chrome_path = ""

" Set Firefox path
let g:markdown_preview_sync_firefox_path = ""

" (Optional)Set your own css theme, put your css file in
" autoload/java/webapp/css directory with a name: name-theme.css,
" then set
let g:markdown_preview_sync_theme = "name"

" Set key
autocmd filetype markdown nnoremap <F9> :MarkSyncPreview<cr>
autocmd filetype markdown nnoremap <S-F9> :MarkSyncClose<cr>
```

Last but not least, comments and issues are welcome.
