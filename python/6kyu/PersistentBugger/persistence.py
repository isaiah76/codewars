def persistence(n):
    return 0 if n < 10 else 1 + persistence(eval('*'.join(str(n))))
