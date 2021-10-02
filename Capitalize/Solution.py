def solve(s):
    if(len(s)>0 and len(s)<1000 ):
        for i in s.split():
             s=s.replace(i,i.capitalize())
    return s
