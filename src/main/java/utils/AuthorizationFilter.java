package utils;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.User;


public class AuthorizationFilter implements Filter {

	@SuppressWarnings("unused")
	private ServletContext context;
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		this.context = filterConfig.getServletContext();
	}

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
			throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) servletRequest;
		HttpServletResponse response = (HttpServletResponse) servletResponse;
		request.setCharacterEncoding("UTF-8");
		String uri = request.getRequestURI();
		String url = uri.substring(request.getContextPath().length(), uri.length());
		
		if (url.startsWith("/admin")) {
			User user = (User) SessionUtil.getInstance().getValue(request, "USER");
			if(user != null) {
				if(user.getIsAdmin() == true) {
					filterChain.doFilter(servletRequest, servletResponse);
				} else if (user.getIsAdmin() == false) {
					System.out.println("Ban khong co quyen truy cap trang nay");
				}
			} else {
				System.out.println("Ban chua dang nhap!");
			}
		} else {
			filterChain.doFilter(servletRequest, servletResponse);
		}
	}

	@Override
	public void destroy() {

	}
}
