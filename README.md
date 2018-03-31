
    创建Fragment栈
    mFragmentStack = FragmentStack.create(getSupportFragmentManager(), R.id.fl_container);
    
    使用
    mFragmentStack.push(fragment, tag);
    mFragmentStack.replace(fragment, tag);
    mFragmentStack.pop();
    mFragmentStack.clear();
    
    栈管理 +setting
      fragment嵌套  mainactivity+4fragment+若干fragment
    
