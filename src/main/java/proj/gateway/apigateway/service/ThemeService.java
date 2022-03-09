package proj.gateway.apigateway.service;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import proj.gateway.apigateway.common.service.CommonService;

@Service("ThemeService")
public class ThemeService extends CommonService {

  @CircuitBreaker(name = "findThemeCount", fallbackMethod = "findThemeCountFallBack")
  public HashMap<String, Object> findThemeCount(HttpServletRequest request) throws Exception {
    String queryString = request.getQueryString();
    String path = request.getRequestURI();
    String method = request.getMethod();
    String token = request.getHeader("authorization");

    return queryRequest(queryString, path, method, token);
  }

  @CircuitBreaker(name = "findThemeItem", fallbackMethod = "findThemeItemFallBack")
  public HashMap<String, Object> findThemeItem(HttpServletRequest request) throws Exception {
    String queryString = request.getQueryString();
    String path = request.getRequestURI();
    String method = request.getMethod();
    String token = request.getHeader("authorization");

    return queryRequest(queryString, path, method, token);
  }

  @CircuitBreaker(name = "findTheme", fallbackMethod = "findThemeFallBack")
  public HashMap<String, Object> findTheme(HttpServletRequest request) throws Exception {
    String queryString = request.getQueryString();
    String path = request.getRequestURI();
    String method = request.getMethod();
    String token = request.getHeader("authorization");

    return queryRequest(queryString, path, method, token);
  }

  @CircuitBreaker(name = "removeTheme", fallbackMethod = "removeThemeFallBack")
  public HashMap<String, Object> removeTheme(HttpServletRequest request) throws Exception {
    String queryString = request.getQueryString();
    String path = request.getRequestURI();
    String method = request.getMethod();
    String token = request.getHeader("authorization");

    return queryRequest(queryString, path, method, token);
  }

  public HashMap<String, Object> findThemeCountFallBack(HttpServletRequest request, Throwable throwable)
      throws Exception {
    throw new Exception(throwable.getMessage());
  }

  public HashMap<String, Object> findThemeItemFallBack(HttpServletRequest request, Throwable throwable)
      throws Exception {
    throw new Exception(throwable.getMessage());
  }

  public HashMap<String, Object> findThemeFallBack(HttpServletRequest request, Throwable throwable)
      throws Exception {
    throw new Exception(throwable.getMessage());
  }

  public HashMap<String, Object> removeThemeFallBack(HttpServletRequest request, Throwable throwable)
      throws Exception {
    throw new Exception(throwable.getMessage());
  }
}