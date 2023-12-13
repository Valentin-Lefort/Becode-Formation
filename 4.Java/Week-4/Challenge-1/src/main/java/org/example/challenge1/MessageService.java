package org.example.challenge1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
public class MessageService {
  private final MessageSource messageSource;
  
  @Autowired
  public MessageService(MessageSource messageSource) {
    this.messageSource = messageSource;
  }
  
  public String getMessage(String key) {
    String localeCode = messageSource.getMessage(key, null, LocaleContextHolder.getLocale());
    
    return messageSource.getMessage(localeCode, null, LocaleContextHolder.getLocale());
  }
  
  public String getMessage(String key, Object[] args) {
    String localeCode = messageSource.getMessage(key, null, LocaleContextHolder.getLocale());
    
    return messageSource.getMessage(localeCode, args, LocaleContextHolder.getLocale());
  }
  
  public String getHelloWorldMessage() {
    return getMessage("configured_language");
  }
}
