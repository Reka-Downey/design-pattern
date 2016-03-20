package org.junbin.sf.filter;

import org.apache.commons.lang.StringUtils;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Date : 2016-03-20 18:35
 * @Author : junbin chung
 * @Email : seraphstorm@163.com
 * @Intro :
 */
public class CharacterEncodingFilter implements Filter {

    private String encoding = "UTF-8";

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        String encoding = filterConfig.getInitParameter("encoding");
        if (!StringUtils.isEmpty(encoding)) {
            this.encoding = encoding;
        }
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;

        req.setCharacterEncoding(encoding);
        resp.setContentType("text/html;charset=UTF-8");
        resp.setCharacterEncoding(encoding);

        chain.doFilter(req, resp);
    }

    @Override
    public void destroy() {
    }
}
