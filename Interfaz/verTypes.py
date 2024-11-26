
class verTypes:#implementacion con singleton
    _instance = None

    def __new__(cls, *args, **kwargs):
        if not cls._instance:
            cls._instance = super(verTypes, cls).__new__(cls, *args, **kwargs)
        return cls._instance
    
    def compare_types(self,var1, var2):
        if var1 == var2 :
            return True
        else:
            return False