class errorMnger:#implementacion con singleton
    _instance = None

    def __new__(cls, *args, **kwargs):
        if not cls._instance:
            cls._instance = super(errorMnger, cls).__new__(cls, *args, **kwargs)
            cls._instance.errors = []
        return cls._instance

    def add_error(self, message):
        self.errors.append(f"{message}")

    def has_errors(self):
        return len(self.errors) > 0

    def get_errors(self):
        return self.errors
    
    def clear_errors_if_any(self):
                    """Limpia todos los errores si existen y devuelve un mensaje."""
                    if self.has_errors():
                        self.errors.clear()
                        return "Se han vaciado todos los errores."
                    return "No hay errores que vaciar."
    